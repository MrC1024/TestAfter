package cn.bdqn.exam.util;

import cn.bdqn.exam.entity.Test;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class ImportService {

    public List<Test> getBankListByExcel(InputStream in, String fileName) throws Exception {
        List<Test> tests = new ArrayList<Test>();
        Workbook work = this.getWorkbook(in, fileName);
        if (null == work) {
            throw new Exception("创建Excel工作薄为空！");
        }
        Sheet sheet = work.getSheetAt(1);
        for (Row row : sheet) {
            if (row.getRowNum() < 1) {//第一行通常为表头，不读
                continue;
            }
            Test test = new Test();
            Cell numCell = row.getCell(0);
            numCell.setCellType(Cell.CELL_TYPE_STRING);

            //必须转换为这个类型的
            //row.getCell(i).setCellType(Cell.CELL_TYPE_STRING);

            test.setAname(row.getCell(0).getStringCellValue());
            test.setTestpaperstepName(row.getCell(1).getStringCellValue());
            test.setKey(row.getCell(2).getStringCellValue());
            test.setAoption(row.getCell(3).getStringCellValue());
            test.setBoption(row.getCell(4).getStringCellValue());
            test.setCoption(row.getCell(5).getStringCellValue());
            test.setDoption(row.getCell(6).getStringCellValue());
            test.setScore(Float.parseFloat(row.getCell(7).toString()));
            test.setAnalysis(row.getCell(8).getStringCellValue());
            test.setTestDates(new Date());
            test.setTestState(0);
            tests.add(test);

        }
        return tests;
    }

    public Workbook getWorkbook(InputStream inStr, String fileName) throws Exception {
        Workbook workbook = null;
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        if (".xls".equals(fileType)) {
            workbook = new HSSFWorkbook(inStr);
        } else if (".xlsx".equals(fileType)) {
            workbook = new XSSFWorkbook(inStr);
        } else {
            throw new Exception("请上传excel文件！");
        }
        return workbook;
    }
}
