package Services;

import Modules.Enseignant;
import Modules.Filiere;
import Modules.Module;

import java.util.ArrayList;

public class servicesModule {
    public static Module addMD(String intitulé, Filiere filière, Enseignant professeur){
        Module module=new Module();
        module.setIntitulé(intitulé);
        module.setFilière(filière);
        module.setProfesseur(professeur);
        module.setId(Database.getId_MD());
        Database.module.add(module);
        return module;
    }
    public static Module uppdateMD( int id,String intitulé, Filiere filière, Enseignant professeur){
        for (Module module: Database.module){
            if (module.getId()==id){
                module.setIntitulé(intitulé);
                module.setFilière(filière);
                module.setProfesseur(professeur);
            }return module;
        }return new Module();
    }
    public static Module getMDbyid(int id){
        for(Module module: Database.module){
            if(module.getId()==id){return module;
        }
    }return new Module();
}
public static ArrayList<Module> deleteMDbyid(int id){
        Database.module.remove(getMDbyid(id));
        return Database.module;
}
public static ArrayList<Module> getAllMD(){
        return Database.module;
}


}
