package think.chapter18.practice;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import net.mindview.util.TextFile;

public class E01_SearchWords {
	public static void main(final String[] args) {
		System.out.println(Arrays.toString(args));
		File path = new File("src/think/chapter13");
		String[] list;
		if(args.length == 0){
			list = path.list();
		}else{
			list = path.list(new FilenameFilter() {
				private String ext = args[0].toLowerCase();//文件名扩展
				
				@Override
				public boolean accept(File dir, String name) {
					if(name.toLowerCase().endsWith(ext)){
						if(args.length == 1){
							return true;
						}
						Set<String> words = new HashSet<String>(
							new TextFile(new File(dir,name).getAbsolutePath(), "\\W+"));
						for(int i=1; i<args.length; i++){
							if(words.contains(args[i])){
								return true;
							}
						}
					}
					return false;
				}
			});
		}
		
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : list){
			System.out.println(dirItem);
		}
	}
}
