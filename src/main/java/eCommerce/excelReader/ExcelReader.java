package eCommerce.excelReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReader
{
		@SuppressWarnings("deprecation")
		public String[][] getExcelData(String excelLocation, String sheetName)
		{
			try
			{
				String dataSets[][] = null;
				FileInputStream file = new FileInputStream(new File(excelLocation));
				@SuppressWarnings("resource")
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				XSSFSheet sheet = workbook.getSheet(sheetName);
				int totalRow = sheet.getLastRowNum() + 1;
				int totalColumn = sheet.getRow(0).getLastCellNum();
				dataSets = new String[totalRow-1][totalColumn];
				Iterator<Row> rowIterator = sheet.iterator();
				int i = 0;
				int t=0;
				while(rowIterator.hasNext())
				{
					Row row = rowIterator.next();
					if(i++!=0)
					{
						int k = t;
						t++;
						Iterator<Cell> cellIterator = row.cellIterator();
						int j=0;
						while(cellIterator.hasNext())
						{
							Cell cell = cellIterator.next();													
							switch(cell.getCellType())
							{
							case Cell.CELL_TYPE_NUMERIC:
								System.out.print(k+",");
								System.out.print(j+",");
								dataSets[k][j++] = cell.getStringCellValue();								
								System.out.println(cell.getNumericCellValue());
								break;
								
							case Cell.CELL_TYPE_STRING:
								System.out.print(k+",");
								System.out.print(j+",");
								dataSets[k][j++] = cell.getStringCellValue();
								System.out.println(cell.getStringCellValue());
								break;
							
							case Cell.CELL_TYPE_BOOLEAN:
								dataSets[k][j++] = cell.getStringCellValue();
								System.out.println(cell.getNumericCellValue());
								break;
							
							case Cell.CELL_TYPE_FORMULA:
								dataSets[k][j++] = cell.getStringCellValue();
								System.out.println(cell.getNumericCellValue());
								break;							
						}				
					}
						System.out.println("");
				}				
			}
			file.close();
			return dataSets;
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			return null;			
		}
	public static void main(String[] args)
	{
		/*String excelLocation = "C://Users//meo meo//workspace//eCommerce//src//main//java//eCommerce//data//TestData.xlsx";
		String sheetName = "Sheet1";
		ExcelReader exreader= new ExcelReader();
		exreader.getExcelData(excelLocation, sheetName);*/
		//System.exit(0);
	}
}
