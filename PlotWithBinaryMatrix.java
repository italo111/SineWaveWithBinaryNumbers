/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plotwithbinarymatrix;

/**
 *
 * @author OWNER
 */
public class PlotWithBinaryMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          double x,y;
       double [] result = new double[100];
       int [] real = new int [100];
       for(int i = -50; i< 50; i++){
           //function------------
           result[i+50] = 50*Math.sin(i*180/3.141516);
           //-------------------
           //scaling it to 20*20 pixels plot
           if(result[i+50]>100){
               result[i+50] = 99;
           }
           else if(result[i+50]<-100){
               result[i+50] = -100;
           }
           real[i+50]= (int)(result[i+50]*10/100);
       }
       System.out.println("Function plot:");
       //function results
       for(int i = 0; i< result.length; i++){
           System.out.print(result[i] + ",");
       }
       System.out.println();
       //function results scaled 
       System.out.println("Scaled results:");
       for(int i = 0; i< real.length; i++){
           System.out.print(real[i] + ",");
       }
        int [][] pe = new int [20][100];
        for(int row = 0; row<20;row++){
            for(int col = 0; col <100; col++){
               pe[row][col]= 0;
            }
        }
        System.out.println();
         for(int row = 0; row<20;row++){
            for(int col = 0; col <100; col++){
                if(col ==99){
                    if(row ==(-1*real[col] + 9)){
                        pe[row][col] = 1;
                         System.out.print(pe[row][col] +"\n");
                    }else{
                        System.out.print(pe[row][col] + "\n");
                    }
                   
                }else{
                    if(row == (-1*real[col] +9 )){
                        pe[row][col] = 1;
                         System.out.print(pe[row][col]);
                    }
                    else{
                        System.out.print(pe[row][col]);
                    }
                        
                   
               }
             
            }
        }
    }
    
}
