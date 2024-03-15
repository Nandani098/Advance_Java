package in.co.rays.Marksheet;

import java.util.Iterator;
import java.util.List;

public class TestSMarksheet {

	public static void main(String[] args) throws Exception {

		// testSearch();
		// testFindByPk();
		// testSearchSimple();
		testSearchD();

	}

	public static void testSearch() throws Exception {
		SMarksheetModel model = new SMarksheetModel();

		model.search();

	}

	public static void testFindByPk() throws Exception {
		SMarksheetModel model = new SMarksheetModel();
		SMarksheetBean bean = model.findByPk(10);

		System.out.print("\t" + bean.getId());
		System.out.print("\t" + bean.getRollNo());
		System.out.print("\t" + bean.getName());
		System.out.print("\t" + bean.getPhysics());
		System.out.print("\t" + bean.getChemistry());
		System.out.println("\t" + bean.getMaths());

	}

	public static void testSearchSimple() throws Exception {

		SMarksheetModel model = new SMarksheetModel();
		List list = model.searchSimple();
		Iterator it = list.iterator();

		while (it.hasNext()) {
			SMarksheetBean bean = (SMarksheetBean) it.next();
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());
		}

	}

	private static void testSearchD() throws Exception {

		SMarksheetBean bean = new SMarksheetBean();
		bean.setId(4);
		bean.setName("n");

		SMarksheetModel model = new SMarksheetModel();

		List list = model.searchD(bean, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (SMarksheetBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		}
	}
}
