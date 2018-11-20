import ca.caProject.ClientMaster;
import pageObjects.ReadExcel;

public class TestExcelFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String client_name;
		ReadExcel.setExcelFile(project.data.constants.Constant.Path_TestData+project.data.constants.Constant.File_TestData, project.data.constants.Constant.sheetName);
		client_name=ReadExcel.getCellData(1, 4);
		System.out.println(client_name);
		ClientMaster.callData(1);
		ClientMaster.SetData();
	}

}
