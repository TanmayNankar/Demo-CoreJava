package com.cg.method;
class voting {
	public static void main(String[] args) {
		int i, j;
		i = 10;
		j = 0;

		try {

			int k = i / j;
			if (K == 0) {
				throw new NewException("this is not possible");
			}
			System.out.println(k);

		} catch (NewException e) {
			System.out.println("error");
		}

	}
}