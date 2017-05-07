package org.ktu.examples;

public class ConstructLTConverter {
	public String getNumberName(int n){
		String res = "";
		if(n < 0){
			res = "minus ";
		}
		n = Math.abs(n);
		return res + performConversion(n, false);
	}
	private String performConversion(int n, boolean ignoreZero){
		switch(n){
			case 0:
				return ignoreZero?"":"nulis";
			case 1:
				return "vienas";
			case 2:
				return "du";
			case 3:
				return "trys";
			case 4:
				return "keturi";
			case 5:
				return "penki";
			case 6:
				return "šeši";
			case 7:
				return "septyni";
			case 8:
				return "aštuoni";
			case 9:
				return "devyni";
			case 10:
				return "dešimt";
			case 11:
				return "vienuolika";
			case 12:
				return "dvylika";
			case 13:
				return "trylika";
			case 14:
				return "keturiolika";
			case 15:
				return "penkiolika";
			case 16:
				return "šešiolika";
			case 17:
				return "septyniolika";
			case 18:
				return "aštuoniolika";
			case 19:
				return "devyniolika";
			case 20:
				return "dvidešimt";
			default:
				return resolveHigherTens(n);
		}
	}
	private String resolveHigherTens(int n){
		if(n > 100 || n <= 20){
			return "didelis skaičius";
		}
		int tens = n/10;
		int ones = n%10;
		switch(tens){
			case 2:
				return "dvidešimt " + performConversion(ones, true);
			case 3:
				return "trisdešimt " + performConversion(ones, true);
			case 4:
				return "keturiasdešimt " + performConversion(ones, true);
			case 5:
				return "penkiasdešimt " + performConversion(ones, true);
			case 6:
				return "šešiasdešimt " + performConversion(ones, true);
			case 7:
				return "septyniasdešimt " + performConversion(ones, true);
			case 8:
				return "aštuoniasdešimt " + performConversion(ones, true);
			case 9:
				return "devyniasdešimt " + performConversion(ones, true);
			case 10:
				return ones == 0?"šimtas ":"didelis skaičius";
			default:
				return "neegzistuojantis skaičius arba programuotojo klaida...";
		}
	}
	public String getBoolName(boolean x){
		return x?"tiesa":"melas";
	}
	public String getDoubleName(double n){
		String res = "";
		if(n < 0){
			res = "minus ";
		}
		n = Math.abs(n);
		if(n > 100){
			return "didelis skaičius";
		}
		int wholePart = (int)Math.floor(n);
		int hundredths = (int)Math.round((n - wholePart)*100);
		res += performConversion(wholePart, false);
		if(hundredths != 0){
			res += " " + getProperTermForWhole(wholePart) + " ir " + convertHundredths(hundredths);
		}
		return res;
	}
	public String getFloatName(float f){
		return getDoubleName((double)f);
	}
	private String convertHundredths(int n){
		switch(n){
		case 0:
			return "šimtųjų";
		case 1:
			return "viena šimtoji";
		case 2:
			return "dvi šimtosios";
		case 3:
			return "trys šimtosios";
		case 4:
			return "keturios šimtosios";
		case 5:
			return "penkios šimtosios";
		case 6:
			return "šešios šimtosios";
		case 7:
			return "septynios šimtosios";
		case 8:
			return "aštuonios šimtosios";
		case 9:
			return "devynios šimtosios";
		case 10:
			return "dešimt šimtųjų";
		case 11:
			return "vienuolika šimtųjų";
		case 12:
			return "dvylika šimtųjų";
		case 13:
			return "trylika šimtųjų";
		case 14:
			return "keturiolika šimtųjų";
		case 15:
			return "penkiolika šimtųjų";
		case 16:
			return "šešiolika šimtųjų";
		case 17:
			return "septyniolika šimtųjų";
		case 18:
			return "aštuoniolika šimtųjų";
		case 19:
			return "devyniolika šimtųjų";
		case 20:
			return "dvidešimt šimtųjų";
		default:
			return resolveHigherTensOfHudredths(n);
	}
	}
	private String resolveHigherTensOfHudredths(int n){
		if(n > 100 || n <= 20){
			return "didelis skaičius";
		}
		int tens = n/10;
		int ones = n%10;
		switch(tens){
			case 2:
				return "dvidešimt " + convertHundredths(ones);
			case 3:
				return "trisdešimt " + convertHundredths(ones);
			case 4:
				return "keturiasdešimt " + convertHundredths(ones);
			case 5:
				return "penkiasdešimt " + convertHundredths(ones);
			case 6:
				return "šešiasdešimt " + convertHundredths(ones);
			case 7:
				return "septyniasdešimt " + convertHundredths(ones);
			case 8:
				return "aštuoniasdešimt " + convertHundredths(ones);
			case 9:
				return "devyniasdešimt " + convertHundredths(ones);
			default:
				return "";
		}
	}
	private String getProperTermForWhole(int n){
		int tens = n/10;
		int ones = n%10;
		if(tens == 1){
			return "sveikų";
		}
		switch(ones){
			case 0:
				return "sveikų";
			case 1:
				return "sveikas";
			default:
				return "sveiki";	
		}
	}
}
