import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class ReadIniFilesGetReqData
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader brForTables = new BufferedReader(new FileReader("E:\\Girish.D\\2017\\5 May\\eg_tables.txt"));
		BufferedReader brForLangUs = null;
		
		BufferedWriter LayerReq1 = new BufferedWriter(new FileWriter("E:\\Girish.D\\2017\\5 May\\Component1\\LayerReq1.txt"));
		BufferedWriter LayerReq2 = new BufferedWriter(new FileWriter("E:\\Girish.D\\2017\\5 May\\Component1\\LayerReq2.txt"));
		
		String str = "Test1,Test2,Test3,Test4,,Test5,,Test6";
		StringTokenizer st = new StringTokenizer(str,",");
		int testsSize = st.countTokens();
		for(int i = 0; i < testsSize ; i++)
		{
			String testName = st.nextToken();
			
			if(testName == null || testName.length() == 0)
				continue;
			System.out.println("testName: "+testName);
			
			String tableLine = "";
			try
			{
				while ((tableLine = brForTables.readLine()) != null) 
				{
					//System.out.println("1 thisLine: "+thisLine);
					if(tableLine.contains(testName))
					{
						if(tableLine.contains("Host") || tableLine.contains("Application"))
							break;
						
						//System.out.println("1 thisLine: "+thisLine);
						brForLangUs = new BufferedReader(new FileReader("E:\\Girish.D\\2017\\5 May\\eg_lang_US.txt"));
						String langLine = "";
						while((langLine = brForLangUs.readLine()) != null)
						{
							if(langLine.contains(testName))
							{
								System.out.println("2 thisLine: "+langLine);
								if(tableLine.contains("LayerReq1"))
								{
									LayerReq1.write(langLine);
									LayerReq1.newLine();
									LayerReq1.flush();
								}
								else if(tableLine.contains("LayerReq2"))
								{
									LayerReq2.write(langLine);
									LayerReq2.newLine();
									LayerReq2.flush();
								}
							}
						}
						break;
					}
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			/*finally
			{
				try 
				{
					//brForTables.close();
					//brForLangUs.close();
					//layer1.close();
					layer2.close();
				} catch (IOException e) {e.printStackTrace();}
			}*/		
		}
	}

}
