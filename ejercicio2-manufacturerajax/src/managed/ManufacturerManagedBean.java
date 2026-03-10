package managed;

import entity.Manufacturer;
import java.util.ArrayList;
import java.util.List;

public class ManufacturerManagedBean {

    private String search;
    private List<Manufacturer> manufacturers;

    public ManufacturerManagedBean(){

        manufacturers = new ArrayList<>();

        manufacturers.add(new Manufacturer(1,"Toyota","Japan"));
        manufacturers.add(new Manufacturer(2,"Ford","USA"));
        manufacturers.add(new Manufacturer(3,"BMW","Germany"));
        manufacturers.add(new Manufacturer(4,"Renault","France"));

    }

    public List<Manufacturer> getFiltered(){

        if(search == null || search.isEmpty()){

            return manufacturers;

        }

        List<Manufacturer> result = new ArrayList<>();

        for(Manufacturer m : manufacturers){

            if(m.getName().toLowerCase().contains(search.toLowerCase())){

                result.add(m);

            }

        }

        return result;

    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

}
