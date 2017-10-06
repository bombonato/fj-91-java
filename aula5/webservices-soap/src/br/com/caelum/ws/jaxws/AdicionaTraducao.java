
package br.com.caelum.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "adicionaTraducao", namespace = "http://ws.caelum.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adicionaTraducao", namespace = "http://ws.caelum.com.br/", propOrder = {
    "palavra",
    "traducao"
})
public class AdicionaTraducao {

    @XmlElement(name = "palavra", namespace = "")
    private String palavra;
    @XmlElement(name = "traducao", namespace = "")
    private String traducao;

    /**
     * 
     * @return
     *     returns String
     */
    public String getPalavra() {
        return this.palavra;
    }

    /**
     * 
     * @param palavra
     *     the value for the palavra property
     */
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getTraducao() {
        return this.traducao;
    }

    /**
     * 
     * @param traducao
     *     the value for the traducao property
     */
    public void setTraducao(String traducao) {
        this.traducao = traducao;
    }

}
