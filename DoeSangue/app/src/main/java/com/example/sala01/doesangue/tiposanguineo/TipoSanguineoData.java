package com.example.sala01.doesangue.tiposanguineo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sala01 on 19/05/2017.
 */

public class TipoSanguineoData {

    public static List<TipoSanguineoItem> getList(){
        List<TipoSanguineoItem> tipoSanguineoItems = new ArrayList<>();

        tipoSanguineoItems.add(new TipoSanguineoItem("http://icon-icons.com/icons2/910/PNG/128/droplet_icon-icons.com_71209.png", "A+"));
        tipoSanguineoItems.add(new TipoSanguineoItem("http://icon-icons.com/icons2/910/PNG/128/droplet_icon-icons.com_71209.png", "A-"));
        tipoSanguineoItems.add(new TipoSanguineoItem("http://icon-icons.com/icons2/910/PNG/128/droplet_icon-icons.com_71209.png", "AB+"));
        tipoSanguineoItems.add(new TipoSanguineoItem("http://icon-icons.com/icons2/910/PNG/128/droplet_icon-icons.com_71209.png", "AB-"));
        tipoSanguineoItems.add(new TipoSanguineoItem("http://icon-icons.com/icons2/910/PNG/128/droplet_icon-icons.com_71209.png", "B+"));
        tipoSanguineoItems.add(new TipoSanguineoItem("http://icon-icons.com/icons2/910/PNG/128/droplet_icon-icons.com_71209.png", "B-"));
        tipoSanguineoItems.add(new TipoSanguineoItem("http://icon-icons.com/icons2/910/PNG/128/droplet_icon-icons.com_71209.png", "O+"));
        tipoSanguineoItems.add(new TipoSanguineoItem("http://icon-icons.com/icons2/910/PNG/128/droplet_icon-icons.com_71209.png", "O-"));

        return tipoSanguineoItems;
    }
}
