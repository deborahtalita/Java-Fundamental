package javacollection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class JsonToObject {
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		try {
			Type barangListType = new TypeToken<ArrayList<Barang>>() {}.getType();
			FileReader reader= new FileReader("C:\\Kuliah\\Semester 3\\PBO (PR)\\Tugas\\TugasPrak12\\src\\main\\java\\javacollection\\barang.json");
			
			ArrayList<Barang> listBarang = gson.fromJson(reader, barangListType);
			
			System.out.println("List Barang:");
			for(int i = 0; i < listBarang.size(); i++) {
				System.out.println((i + 1) + ". " + listBarang.get(i).toString());
			}
		} catch (JsonSyntaxException | FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
}
