package dbsimulator;

public class Table {

	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredate;
	private int sal;
	private int comm;
	private int deptno;

	public Table() {
		// TODO Auto-generated constructor stub
	}

	public Table(int empno, String ename, String job, int mgr, String hiredate, int sal, int comm, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;

	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setJob(String job) {
		this.job = job;

	}

	public void setMgr(int mgr) {
		this.mgr = mgr;

	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;

	}

	public void setSal(int sal) {
		this.sal = sal;

	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;

	}

	public void displayTable() {
		System.out.println("------------------------------------------");
		System.out.println("Empno: " + empno);
		System.out.println("Ename: " + ename);
		System.out.println("Job: " + job);
		System.out.println("Mgr: " + mgr);
		System.out.println("Hiredate: " + hiredate);
		System.out.println("Sal:" + sal);
		System.out.println("Comm: " + comm);
		System.out.println("Deptno: " + deptno);
		System.out.println("------------------------------------------");

	}
}
