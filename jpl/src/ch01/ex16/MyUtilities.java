package src;

import java.io.FileInputStream;
import java.io.IOException;

public class MyUtilities {

	public double[] getDataSet(String setName)throws BadDataSetException{

		String file = setName + ".dset";
		FileInputStream in = null;
		try{
			in = new FileInputStream(file);
			return readDataSet(in);
		}catch (IOException e){
			throw new BadDataSetException(e, file);
		}finally {
			try{
				if(in != null){
					in.close();
				}
			}catch(IOException e){
				;
			}
		}
	}

	public double[] readDataSet(FileInputStream in){
		double[] ret = {1.0,1.2};
		return ret;
	}
/*
	public static void main(String[] args){
		MyUtilities util = new MyUtilities();
		try {
//			double [] result = util.getDataSet("sample");
			double [] result = util.getDataSet("test");
			System.out.println(result[0]+","+result[1]);
		} catch (BadDataSetException e) {
			e.printStackTrace();
		}
	}
*/
}
