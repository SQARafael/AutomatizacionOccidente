package com.spotify.open.steps;

import com.spotify.open.pageObjectModel.PaginaInicialPageObject;
import com.spotify.open.pageObjectModel.PrincipaPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PrincipalPageSteps {
    @Page
    PrincipaPageObject principaPageObject;
    @Step("Abrir navegador principal")
    public void abrirPaginaPrincipal(){
        principaPageObject.openUrl("https://open.spotify.com/intl-es?flow_ctx=f670cfed-d14e-41d5-81d3-dfd34e72ad95%3A1700307105");

    }
}
