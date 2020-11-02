package space.merunka.workerslist.Converters;

import androidx.room.TypeConverter;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import space.merunka.workerslist.pojo.Specialty;

public class Converter {

    @TypeConverter
    public String listSpecialtiesToString(List<Specialty> specialtyList){
        return new Gson().toJson(specialtyList);
    }

    @TypeConverter
    public List<Specialty> stringToListSpecialties (String specialtiesAsString){
        Gson gson = new Gson();
        ArrayList objects = gson.fromJson(specialtiesAsString, ArrayList.class);
        ArrayList<Specialty> specialties = new ArrayList<>();
        for (Object o : objects){
            specialties.add(gson.fromJson(o.toString(), Specialty.class));
        }
        return specialties;
    }
}
