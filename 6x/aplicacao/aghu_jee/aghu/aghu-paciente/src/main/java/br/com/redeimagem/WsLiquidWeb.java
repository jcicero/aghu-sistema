
package br.com.redeimagem;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * Serviço de Integração do LiquidWeb
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "WsLiquidWeb", targetNamespace = "http://redeimagem.com.br/", wsdlLocation = "http://rho.hcpa/wsLiquidWeb/Default.asmx?WSDL")
public class WsLiquidWeb
    extends Service
{

    private final static URL WSLIQUIDWEB_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.com.redeimagem.WsLiquidWeb.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.com.redeimagem.WsLiquidWeb.class.getResource(".");
            url = new URL(baseUrl, "http://rho.hcpa/wsLiquidWeb/Default.asmx?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://rho.hcpa/wsLiquidWeb/Default.asmx?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WSLIQUIDWEB_WSDL_LOCATION = url;
    }

    public WsLiquidWeb(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsLiquidWeb() {
        super(WSLIQUIDWEB_WSDL_LOCATION, new QName("http://redeimagem.com.br/", "WsLiquidWeb"));
    }

    /**
     * 
     * @return
     *     returns WsLiquidWebSoap
     */
    @WebEndpoint(name = "WsLiquidWebSoap")
    public WsLiquidWebSoap getWsLiquidWebSoap() {
        return super.getPort(new QName("http://redeimagem.com.br/", "WsLiquidWebSoap"), WsLiquidWebSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsLiquidWebSoap
     */
    @WebEndpoint(name = "WsLiquidWebSoap")
    public WsLiquidWebSoap getWsLiquidWebSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://redeimagem.com.br/", "WsLiquidWebSoap"), WsLiquidWebSoap.class, features);
    }

}
