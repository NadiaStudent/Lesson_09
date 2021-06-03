package ua.lviv.lgs;

import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println();
		System.out.println("������ 1,��� ��������� �� ���� �������� ����� ");
		System.out.println("������ 2,��� ������� �� ����� � ����� � ����� ���� ");
		System.out.println("������ 3,��� ������� �� ����� �� ����� ���� ���� ������� ��� ");
		System.out.println("������ 4,��� ������� �� ����� �� ����� �� ����� ����� ������� ��� ");
		System.out.println("������ 5, ���,������� �� ����� �� ����� �� ����� ����� ������� ��� ");
		System.out.println("������ 6,��� ������� �� ����� �������� ���� ���� ");
		System.out.println("������ 7, ��� ������� �� ����� ��������� ���� ����");
		System.out.println("������ 8,��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("������ 9,��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("������ 10,��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");
	}

	public static void main(String[] args) throws WrongInputConsoleParametersException{
		Scanner scanner = new Scanner(System.in);
		Months[] arrayMonths = Months.values();
		Seasons[] arraySeasons = Seasons.values();
		while (true) {
			menu();
			switch (scanner.nextInt()) {
			case 1: {
				System.out.println("�������� ��������� ��������� �����");
				System.out.println("������ �����");
				scanner = new Scanner(System.in);
				String month1 = scanner.next().toUpperCase();
				
				boolean flag =  isMonthExists(arrayMonths, month1);
				for (Months c : arrayMonths) {
					if (c.name().equals(month1)) {
						System.out.println("�������� ����� ����");
						flag = true;
					}
				}
				if (!flag) {
					String message = "������  ����� ����";
					throw new WrongInputConsoleParametersException(message);
				}
				break;

			}

			case 2: {

				System.out.println("̳���� � ����� � ����� ����");
				System.out.println(" ������ ���� ����");
				String season2 = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months months : arrayMonths) {
					if (months.getSeason().name().equalsIgnoreCase(season2)) {
						flag = true;
					}
				}
				if (flag == true) {
					System.out.println("���� ���� " + season2 + "  � ��������� ������:");
					for (Months months2 : arrayMonths) {
						if (months2.getSeason().toString().equalsIgnoreCase(season2)) {
							System.out.println(months2);
						}
					}
				}
				if (flag == false) {
					String message = "����� ������ ����";
				throw new WrongInputConsoleParametersException(message);}
				
				break;
			}
			case 3: {
				System.out.println("��������� ��� ������ � �������� ������� ���");
				System.out.println("������ ������� ���:");
				int numberOfDays3 = scanner.nextInt();

				boolean flag = false;

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() == numberOfDays3) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("ʳ������ ��� " + numberOfDays3 + " � ��������� ������:");

					for (Months months2 : arrayMonths) {
						if (months2.getNumberOfDays() == numberOfDays3) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false) {
					String message ="����� ������ ����";
				throw new WrongInputConsoleParametersException(message);}
				break;
			}
			case 4: {
				System.out.println("��������� �� ����� ��� ������, �� ����� ����� ������� ���");
				System.out.println("������ ������� ���:");
				int numberOfDays4 = scanner.nextInt();

				boolean flag = false;

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() == numberOfDays4 && numberOfDays4 >= 30) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("ʳ������ ��� ����� " + numberOfDays4 + " � ����� ������:");

					for (Months months2 : arrayMonths) {
						if (months2.getNumberOfDays() < numberOfDays4) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false) {
					String message ="����� ������ ����!";
				throw new WrongInputConsoleParametersException(message);}
				break;
			}
			case 5: {
				System.out.println("��������� �� ����� ��� ������, �� ����� ����� ������� ���");
				System.out.println("������ ������� ���:");
				int numberOfDays5 = scanner.nextInt();

				boolean flag = false;

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() == numberOfDays5 && numberOfDays5 <= 30) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("ʳ������ ��� ����� " + numberOfDays5 + " � ����� ������:");

					for (Months months2 : arrayMonths) {
						if (months2.getNumberOfDays() > numberOfDays5) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false) {
					String message ="����� ������ ����!";
				throw new WrongInputConsoleParametersException(message);}
				break;
			}

			case 6: {
				System.out.println("��������� ��������� ���� ����:");
				System.out.println("������ ���� ����:");
				String season6 = scanner.next();

				boolean flag = false;

				for (Seasons seasons : arraySeasons) {
					if (seasons.name().equalsIgnoreCase(season6)) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("�������� ���� ����:");

					Seasons seasons2 = Seasons.valueOf(firstUpperCase(season6.toLowerCase()));
					int i = seasons2.ordinal();

					if (i == (arraySeasons.length - 1)) {
						i = 0;
						System.out.println(arraySeasons[i]);
					} else {
						System.out.println(arraySeasons[i + 1]);
					}
				}

				if (flag == false) {
		
				String message = "���� ���� ���� ����!";
				throw new WrongInputConsoleParametersException(message);}
				break;
			}
			case 7: {
				System.out.println(" �������� ��������� ���������� ���� ����");
				System.out.println("������� ���� ����:");
				String season7 = scanner.next();

				boolean flag = false;

				for (Seasons seasons : arraySeasons) {
					if (seasons.name().equalsIgnoreCase(season7)) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("��������� ���� ����:");

					Seasons seasons2 = Seasons.valueOf(firstUpperCase(season7.toLowerCase()));
					int i = seasons2.ordinal();

					if (i == 0) {
						i = (arraySeasons.length - 1);
						System.out.println(arraySeasons[i]);
					} else {
						System.out.println(arraySeasons[i - 1]);
					}
				}

				if (flag == false) {
					String message = "���� ���� ���� ����!";
				throw new WrongInputConsoleParametersException(message);}
				

				break;
			}
			case 8: {
				System.out.println("�������� ��������� ������ � ������ ������� ���");

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() % 2 == 0) {
						System.out.println(months);
					}
				}

				break;
			}
			case 9: {
				System.out.println(" �������� ��������� ������ � �������� ������� ��� ");

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() % 2 != 0) {
						System.out.println(months);
					}
				}

				break;
			}
			case 0: {
				System.out.println(" �������� �������� ������� ������ ��� � ��������� �����");
				System.out.println("������ �����:");
				String month0 = scanner.next();

				boolean flag = isMonthExists(arrayMonths, month0);

				if (flag == true) {
					Months month = Months.valueOf(firstUpperCase(month0.toLowerCase()));

					if (month.getNumberOfDays() % 2 == 0) {
						System.out.println("ʳ������ ��� � ����� " + month0 + " - " + month.getNumberOfDays()
								+ ". �� ����� ������");
					} else {
						System.out.println("ʳ������ ��� � ����� " + month0 + " - " + month.getNumberOfDays()
								+ "�� ����� �������");
					}
				}

				if (flag == false)
					System.out.println("������ ����� ����!");

				break;
			}

			default: {
				System.out.println("������ ����� �� 0 �� 9!");

				break;
			}
			}
		}
	}

	/**
	 * Checks if the month exists in array and returns a boolean expression
	 * 
	 * @param arrayMonths, month
	 * 
	 * @return boolean expression
	 * 
	 */

	static boolean isMonthExists(Months[] arrayMonths, String month) {
		boolean flag = false;

		for (Months months : arrayMonths) {
			if (months.name().equalsIgnoreCase(month)) {
				flag = true;
			}
		}

		return flag;
	}

	/**
	 * Converts the first character of a string to upper case
	 * 
	 * @param string
	 * 
	 * @return String (with first letter in UpperCase)
	 * 
	 */

	static String firstUpperCase(String string) {
		if (string == null || string.isEmpty()) {
			return string;
		} else {
			return string.substring(0, 1).toUpperCase() + string.substring(1);
		}
	}
}
	