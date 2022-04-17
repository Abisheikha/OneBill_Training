package com.tyss.threadProgram;

public class ThreadMain extends Thread {

	int number;

	public ThreadMain(int number) {
		super();
		this.number = number;
	}

	public void run() {
		while (number > 0) {
			if (number % 2 == 0) {
				System.out.println(number);
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			number--;
		}
	}

	public static void main(String[] args) {

		ThreadMain threadMain = new ThreadMain(10);
		threadMain.start();

		ThreadMain threadMain2 = new ThreadMain(20);
		threadMain2.start();
	}

}
