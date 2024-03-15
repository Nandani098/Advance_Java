package in.co.rays.textMarksheet;

public class TestMarksheet {
	
	public static void main(String[] args) throws Exception {
		
		//testAdd();
		//testUpdate();
		//testDelete();
		testNextPk();
		
		
		
	}

	
	private static void testNextPk() throws Exception {
	
	MarksheetModel model = new MarksheetModel()	;
	int pk= model.nextPk();
	
	System.out.println("pk="+pk);
	
	}
	
	private static void testAdd() throws Exception {
	MarksheetBean bean = new MarksheetBean();
	
	bean.setId(18);
	bean.setName("vinay");
	bean.setRollno(106);
	bean.setPhysics(99);
	bean.setChemistry(22);
	bean.setMaths(29);
	
	MarksheetModel model = new MarksheetModel();
	model.add(bean);
	}
	private static void testUpdate() throws Exception {
	MarksheetBean bean = new MarksheetBean();
	
	bean.setId(18);
	bean.setName("parihar");
	bean.setRollno(108);
	bean.setPhysics(99);
	bean.setChemistry(98);
	bean.setMaths(94);
	
	MarksheetModel model= new MarksheetModel();
	model.update(bean);
		
	}
	
	private static void testDelete() throws Exception {
	 MarksheetModel model = new MarksheetModel();
	 model.delete(18);
	}
		
	}
