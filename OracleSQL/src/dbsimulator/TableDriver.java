package dbsimulator;

import java.util.Scanner;

public class TableDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Table e1 = new Table(7369, "SMITH", "CLERK", 7902, "17-DEC-80 ", 800, 0, 20);
		Table e2 = new Table(7499, "ALLEN", "SALESMAN ", 7698, "20-FEB-81 ", 1600, 300, 30);
		Table e3 = new Table(7521, "WARD ", "SALESMAN ", 7698, "22-FEB-81 ", 1250, 500, 30);
		Table e4 = new Table(7566, "JONES ", "MANAGER  ", 7839, "02-APR-81  ", 2975, 0, 20);
		Table e5 = new Table(7654, "MARTIN  ", "SALESMAN ", 7698, "28-SEP-81 ", 1250, 1400, 30);
		Table e6 = new Table(7698, "BLAKE ", "MANAGER ", 7839, "01-MAY-81  ", 2850, 0, 30);
		Table e7 = new Table(7782, "CLARK", "MANAGER  ", 7839, "09-JUN-81  ", 2450, 0, 10);
		Table e8 = new Table(7788, "SCOTT  ", "ANALYST  ", 7566, "19-APR-87 ", 3000, 0, 20);
		Table e9 = new Table(7839, "KING ", "PRESIDENT  ", 0, "17-NOV-81 ", 5000, 0, 10);
		Table e10 = new Table(7844, "TURNER  ", "SALESMAN ", 7698, "08-SEP-81 ", 1500, 0, 30);
		Table e11 = new Table(7876, "ADAMS ", " CLERK   ", 7788, "23-MAY-87 ", 1100, 0, 20);
		Table e12 = new Table(7900, "JAMES ", "CLERK   ", 7698, "03-DEC-81 ", 950, 0, 30);
		Table e13 = new Table(7902, "FORD  ", "ANALYST ", 7566, "03-DEC-81 ", 3000, 0, 20);
		Table e14 = new Table(7934, "MILLER ", " CLERK  ", 7782, "23-JAN-82 ", 1300, 0, 10);

		e1.displayTable();
		e2.displayTable();

		System.out.println("------------------------------------------");
		System.out.println("Welcome");
		System.out.println("------------------------------------------");
		System.out.println("Select from below:");

		System.out.println("Enter 1 to change Ename :");
		String input = sc.next();

		if (input.equals("ename")) {
			System.out.println("Enter the Ename: ");
			String ename = sc.next();
			e1.setEname(ename);

			e1.displayTable();
		} else {
			System.out.println("The End");
		}

		sc.close();

	}
}
