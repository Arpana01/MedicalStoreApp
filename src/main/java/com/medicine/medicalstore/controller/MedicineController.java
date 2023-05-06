package com.medicine.medicalstore.controller;

import com.medicine.medicalstore.model.MedicineModel;
import com.medicine.medicalstore.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicineController {
    @Autowired
    private MedicineRepository mr;
    @GetMapping("medicine")
    public String medicineExipryDate(){
        return "mrp";
    }
    @PostMapping("/addMedicine")
    public MedicineModel addMedicine(@RequestBody MedicineModel mc){
        return this.mr.save(mc);
    }
    @PostMapping("/uploadExcel")
    public List<>
    public static List<Tutorial> excelToTutorials(InputStream is) {
        try {
            Workbook workbook = new XSSFWorkbook(is);

            Sheet sheet = workbook.getSheet(SHEET);
            Iterator<Row> rows = sheet.iterator();

            List<Tutorial> tutorials = new ArrayList<Tutorial>();

            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = rows.next();

                // skip header
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cellsInRow = currentRow.iterator();

                Tutorial tutorial = new Tutorial();

                int cellIdx = 0;
                while (cellsInRow.hasNext()) {
                    Cell currentCell = cellsInRow.next();

                    switch (cellIdx) {
                        case 0:
                            tutorial.setId((long) currentCell.getNumericCellValue());
                            break;

                        case 1:
                            tutorial.setTitle(currentCell.getStringCellValue());
                            break;

                        case 2:
                            tutorial.setDescription(currentCell.getStringCellValue());
                            break;

                        case 3:
                            tutorial.setPublished(currentCell.getBooleanCellValue());
                            break;

                        default:
                            break;
                    }

                    cellIdx++;
                }

                tutorials.add(tutorial);
            }

            workbook.close();

            return tutorials;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
        }
    }
}
