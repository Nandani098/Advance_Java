package in.co.rays.Marksheet;

public class TestMarksheet {
	
	public static void main(String[] args) throws Exception {
		
		//testSearch();
		//testDelete();
		//testUpdate();
		testAdd();
	}

	
	private static void testSearch() throws Exception {
		
	MarksheetModel model = new  MarksheetModel();
	model.search();
	}	
		
	
	
    public static void testDelete() throws Exception {
    MarksheetModel model = new  MarksheetModel();	
    model.delete(1);	
    }
    
    

    private static void testUpdate() throws Exception {
    MarksheetBean bean= new MarksheetBean();
   
    bean.setId(7);
    bean.setRollNo(107);
    bean.setName("Vinay");
    bean.setPhysics(100);
    bean.setChemistry(99);
    bean.setMaths(99);
   
    MarksheetModel model  = new MarksheetModel();
    model.update(bean);
    }
    
    
    
    private static void testAdd() throws Exception {
    	MarksheetBean bean = new MarksheetBean();
    	
    	bean.setId(18);
    	bean.setRollNo(118);
    	bean.setName("Parihar");
    	bean.setPhysics(99);
    	bean.setChemistry(100);
    	bean.setMaths(89);
    	
    	MarksheetModel model = new MarksheetModel();
    	model.add(bean);
    	
    }
    
    
	}

