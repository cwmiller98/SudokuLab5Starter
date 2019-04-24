package pkgEnum;

import java.util.HashMap;

import pkgGame.Sudoku.SudokuCell;

public enum eGameDifficulty {

	EASY(100), MEDIUM(500), HARD(1000);
	
	private int iDifficulty;
	
	private static final HashMap<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();

	private eGameDifficulty(int diff) {
		this.iDifficulty = diff;

	}
	
	public int getiDifficulty() {
		return iDifficulty;
	}
	
	public static eGameDifficulty get(int iDifficulty) {
		if (iDifficulty >= 1000) {
			eGameDifficulty e = lookup.get(HARD);
			return e;
		}
		else if (iDifficulty >=500 && iDifficulty <1000) {
			eGameDifficulty x = lookup.get(MEDIUM);
			return x;
		}
		else if (iDifficulty >= 100 && iDifficulty < 500) {
			eGameDifficulty s = lookup.get(EASY);
			return s;
		}
		else
			return null;
	}
	
}
