package ejercicio1;

public class Rut {

	private String rut;

	public Rut(String rut) {
		super();
		this.rut = rut;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	   static public boolean validar(String rut) throws Exception{
	        int suma=0;
	        String dvR,dvT;
	        int[] serie = {2,3,4,5,6,7};
	        rut = rut.replace(".", "");
	        rut = rut.replace("-", "");
	        dvR = rut.substring(rut.length()-1);
	        for(int i = rut.length()-2;i>=0; i--){
	            suma +=  Integer.valueOf(rut.substring(i, i+1))
	                    *serie[(rut.length()-2-i)%6];
	        }
	        dvT=String.valueOf(11-suma%11);
	        if(dvT.compareToIgnoreCase("10") == 0){
	            dvT = "K";
	        }

	        if(dvT.compareToIgnoreCase(dvR) == 0){
	            return true;
	        } else {
	        	throw new Exception();
	        }
	    }
}
