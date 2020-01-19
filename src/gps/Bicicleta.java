package gps;

import java.util.Arrays;

/**
 * Bicicleta class
 * 
 * @Java IES Severo Ochoa
 * @2.0
 */

public class Bicicleta {
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
    }
    

    
    public static int [] longitud(int [] camino, int longitud) {
    	int[] cami;
    	cami = new int [longitud];
    	System.out.println(camino.length);
            for(int i=0;i<cami.length;i++){
            	
            	if(camino.length<=i) {
               
                cami[i]=0;
            	} else {
            		
            		 cami[i]=camino[i];
            	}
            	
            	
            }
            
            return cami;
        }    
    	
    	
    
    
    public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3)
    {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for(int i=0; i<camino1.length; i++)
        {
            sum1 += camino1[i];
            sum2 += camino2[i];
            sum3 += camino3[i];
        }
        
        if(sum1 < sum2 && sum1 < sum3)
        {
            return "camino 1"; 
        }else if(sum2 < sum3 && sum2 < sum1)
        {
            return "camino 2";
        }else if(sum3 < sum1 && sum3 < sum2)
        {
            return "camino 3";
        }else{
            if(sum1 == sum2 && sum2 == sum3)
            {
                return "camino 1, 2 y 3";
            }else if(sum1 == sum3)
            {
                return "caminos 1 y 3";
            }else if(sum2 == sum3){
                return "caminos 2 y 3";
            }else{
                return "caminos 1 y 2";
            }
        }
        
    }

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {12,34,21,46,25,200};
        int[] camino2 = {24,1,5,64,10,15,21,300};
        int[] camino3 = {1,5,6,7,8,10,20,46,104};
        int lon1 =camino1.length;
        int lon2 = camino2.length;
        int lon3 = camino3.length;
        int [] longitudes = {lon1, lon2, lon3};
   	
        Arrays.sort(longitudes);
        
        if(lon1<longitudes[2]) {
        	 camino1= longitud(camino1, longitudes[2]);
        }
        if(lon2<longitudes[2]) {
        	camino2= longitud(camino2, longitudes[2]);
        }
        if(lon3<longitudes[2]) {
        	camino3= longitud(camino3, longitudes[2]);
        }
        
      
        
       System.out.println(camino1.length);
        
        
        System.out.println("El camino más corto es:"+Bicicleta.rutaCorta(camino1,camino2,camino3)+".");
    }
}


