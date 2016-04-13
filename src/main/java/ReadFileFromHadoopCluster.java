	import java.io.*;
	import java.net.*;
	import org.apache.hadoop.fs.*;
	import org.apache.hadoop.io.*;

	public class ReadFileFromHadoopCluster{

	static{
	URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
	}

	public static void main (String [] args) throws Exception{
	InputStream is = null;
	try{
	is=new URL(args[0]).openStream();
	IOUtils.copyBytes(is,System.out,4096,false);
	}finally{
	IOUtils.closeStream(is);
	}
	}
	}
