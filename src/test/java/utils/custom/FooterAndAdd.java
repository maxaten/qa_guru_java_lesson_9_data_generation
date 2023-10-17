package utils.custom;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class FooterAndAdd {
    public FooterAndAdd deleteFooterAndAdd(){
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('#app footer').remove()");
        return this;
    }
}
