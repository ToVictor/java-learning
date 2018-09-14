package think.chapter18.practice;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class E02_Scc {
	private String path;
	public E02_Scc(String path){
		this.path = path;
	}
	
	public List<String> list(){
		List<String> files = listFiles(new File(path));
		Collections.sort(files,String.CASE_INSENSITIVE_ORDER);
		return files;
	}
	public List<String> list(String regex){
		List<String> files = list();
		List<String> result = new ArrayList<String>();
		if(files != null){
			for(String fileName : files){
				if(Pattern.compile(regex).matcher(fileName).find()){
					result.add(fileName);
				}
//				if(fileName.matches(regex)){
//					result.add(fileName);
//				}
			}
		}
		return result;
	}
	
	private List<String> listFiles(File path){
		List<String> allFiles = new ArrayList<String>();
		File[] temp = path.listFiles();
		if(temp != null){
			for(File f : temp){
				if(f.isFile()){
					allFiles.add(f.getName());
				}else{
					allFiles.addAll(listFiles(f));
				}
			}
		}
		return allFiles;
	}
	
	public static void main(String[] args) {
		E02_Scc sortedDirList = new E02_Scc(".");
		List<String> list = sortedDirList.list();
		for(String s : list){
			System.out.println(s);
		}
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();
		list = sortedDirList.list("(?i)scc");
		for(String s : list){
			System.out.println(s);
		}
	}
}
