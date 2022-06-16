package lesson15.FingerSign;

class FingerSign {
	private static final int TYOKI = 0;
	private static final int GU = 1;
	private static final int PA = 2;

	private static int getTyoki() {
		return TYOKI;
	}

	private static int getGu() {
		return GU;
	}

	private static int getPa() {
		return PA;
	}

	public int janken(String yaku) {
		if(yaku.equals("チョキ")) {
			return getTyoki();
		}
		if(yaku.equals("グー")) {
			return getGu();
		}
		if(yaku.equals("パー")) {
			return getPa();

		}
		return -1;
	}

	int jakenAI() {
		return (int)(Math.random() * 3);
	}

}
