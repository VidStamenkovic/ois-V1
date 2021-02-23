public class Gravitacija {
    public static void main(String[] args) {
        System.out.println("OIS je zakon");
    }

    public static double gravitacijskiPospesek(double visina){
		
		double konstC = 6.674*Math.pow(10,-11);
		double m = 5.972*Math.pow(10,24);
		double stevec = konstC*m;
		double polmer = 6.371*Math.pow(10,6);
		double imenovalec = Math.pow(polmer+visina, 2);
		return stevec/imenovalec;
	}

    public static void izpis(double nadmorskaVisina, double gravitacijskiPospesek) {
        System.out.println("Nadmorska višina:" + nadmorskaVisina);
        System.out.println("Gravitacijski pospešek:" + gravitacijskiPospesek);
    }
}
