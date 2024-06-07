package model;

//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v4.0.3 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
//



import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ristorante" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="sitoWeb_social" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="tipologia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="locazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="recensione_media" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   <element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="comune">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                           <attribute name="CAP" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="servizi">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="asporto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             <element name="cons_posto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             <element name="ser_domicilio" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             <element name="pranzo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             <element name="cena" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             <element name="Wi-fi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             <element name="toilette" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           </sequence>
 *                           <attribute name="id_serv" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="cod_rist" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ristorante"
})
@XmlRootElement(name = "provinciaTreviso")
public class ProvinciaTreviso {

    protected List<ProvinciaTreviso.Ristorante> ristorante;

    /**
     * Gets the value of the ristorante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ristorante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRistorante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvinciaTreviso.Ristorante }
     * 
     * 
     * @return
     *     The value of the ristorante property.
     */
    public List<ProvinciaTreviso.Ristorante> getRistorante() {
        if (ristorante == null) {
            ristorante = new ArrayList<>();
        }
        return this.ristorante;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="sitoWeb_social" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="tipologia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="locazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="recensione_media" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         <element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="comune">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
     *                 <attribute name="CAP" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               </extension>
     *             </simpleContent>
     *           </complexType>
     *         </element>
     *         <element name="servizi">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="asporto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   <element name="cons_posto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   <element name="ser_domicilio" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   <element name="rist_pranzo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   <element name="rist_cena" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   <element name="Wi-fi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   <element name="toilette" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 </sequence>
     *                 <attribute name="id_serv" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="cod_rist" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nome",
        "sitoWebSocial",
        "tipologia",
        "locazione",
        "recensione_media",
        "telefono",
        "descrizione",
        "comune",
        "servizi"
    })
    public static class Ristorante {

        @XmlElement(required = true)
        protected String nome;
        @XmlElement(name = "sitoWeb_social", required = true)
        protected String sitoWebSocial;
        @XmlElement(required = true)
        protected String tipologia;
        @XmlElement(required = true)
        protected String locazione;
        @XmlElement(name = "recensione_media")
        protected float recensione_media;
        @XmlElement(required = true)
        protected int telefono;
        @XmlElement(required = true)
        protected String descrizione;
        @XmlElement(required = true)
        protected ProvinciaTreviso.Ristorante.Comune comune;
        @XmlElement(required = true)
        protected ProvinciaTreviso.Ristorante.Servizi servizi;
        @XmlAttribute(name = "cod_rist")
        protected int codRist;

		public String toString() {
			return "Ristorante [nome=" + nome + ", sitoWebSocial=" + sitoWebSocial + ", tipologia=" + tipologia
					+ ", locazione=" + locazione + ", valMedia=" + recensione_media + ", telefono=" + telefono
					+ ", descrizione=" + descrizione + ", comune=" + comune + ", servizi=" + servizi + ", codRist="
					+ codRist + "]";
		}

		/**
         * Recupera il valore della proprietà nome.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNome() {
            return nome;
        }

        /**
         * Imposta il valore della proprietà nome.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNome(String value) {
            this.nome = value;
        }

        /**
         * Recupera il valore della proprietà sitoWebSocial.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSitoWebSocial() {
            return sitoWebSocial;
        }

        /**
         * Imposta il valore della proprietà sitoWebSocial.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSitoWebSocial(String value) {
            this.sitoWebSocial = value;
        }

        /**
         * Recupera il valore della proprietà tipologia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipologia() {
            return tipologia;
        }

        /**
         * Imposta il valore della proprietà tipologia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipologia(String value) {
            this.tipologia = value;
        }

        /**
         * Recupera il valore della proprietà locazione.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocazione() {
            return locazione;
        }

        /**
         * Imposta il valore della proprietà locazione.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocazione(String value) {
            this.locazione = value;
        }

        /**
         * Recupera il valore della proprietà valMedia.
         * 
         */
        public float getValMedia() {
            return recensione_media;
        }

        /**
         * Imposta il valore della proprietà valMedia.
         * 
         */
        public void setValMedia(float value) {
            this.recensione_media = value;
        }

        /**
         * Recupera il valore della proprietà telefono.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public int getTelefono() {
            return telefono;
        }

        /**
         * Imposta il valore della proprietà telefono.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefono(int value) {
            this.telefono = value;
        }

        /**
         * Recupera il valore della proprietà descrizione.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescrizione() {
            return descrizione;
        }

        /**
         * Imposta il valore della proprietà descrizione.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescrizione(String value) {
            this.descrizione = value;
        }

        /**
         * Recupera il valore della proprietà comune.
         * 
         * @return
         *     possible object is
         *     {@link ProvinciaTreviso.Ristorante.Comune }
         *     
         */
        public ProvinciaTreviso.Ristorante.Comune getComune() {
            return comune;
        }

        /**
         * Imposta il valore della proprietà comune.
         * 
         * @param value
         *     allowed object is
         *     {@link ProvinciaTreviso.Ristorante.Comune }
         *     
         */
        public void setComune(ProvinciaTreviso.Ristorante.Comune value) {
            this.comune = value;
        }

        /**
         * Recupera il valore della proprietà servizi.
         * 
         * @return
         *     possible object is
         *     {@link ProvinciaTreviso.Ristorante.Servizi }
         *     
         */
        public ProvinciaTreviso.Ristorante.Servizi getServizi() {
            return servizi;
        }

        /**
         * Imposta il valore della proprietà servizi.
         * 
         * @param value
         *     allowed object is
         *     {@link ProvinciaTreviso.Ristorante.Servizi }
         *     
         */
        public void setServizi(ProvinciaTreviso.Ristorante.Servizi value) {
            this.servizi = value;
        }

        /**
         * Recupera il valore della proprietà codRist.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public int getCodRist() {
            return codRist;
        }

        /**
         * Imposta il valore della proprietà codRist.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodRist(int value) {
            this.codRist = value;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>{@code
         * <complexType>
         *   <simpleContent>
         *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
         *       <attribute name="CAP" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     </extension>
         *   </simpleContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Comune {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "CAP")
            protected int cap;

            /**
             * Recupera il valore della proprietà value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Imposta il valore della proprietà value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Recupera il valore della proprietà cap.
             * 
             * @return
             *     possible object is
             *     {@link int }
             *     
             */
            public int getCAP() {
                return cap;
            }

            /**
             * Imposta il valore della proprietà cap.
             * 
             * @param value
             *     allowed object is
             *     {@link int }
             *     
             */
            public void setCAP(int value) {
                this.cap = value;
            }

        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <element name="asporto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         <element name="cons_posto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         <element name="ser_domicilio" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         <element name="rist_pranzo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         <element name="rist_cena" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         <element name="Wi-fi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         <element name="toilette" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *       </sequence>
         *       <attribute name="id_serv" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "asporto",
            "consPosto",
            "serDomicilio",
            "rist_pranzo",
            "rist_cena",
            "wiFi",
            "toilette"
        })
        public static class Servizi {

            protected boolean asporto;
            @XmlElement(name = "cons_posto")
            protected boolean consPosto;
            @XmlElement(name = "ser_domicilio")
            protected boolean serDomicilio;
            @XmlElement(name = "rist_pranzo")
            protected boolean rist_pranzo;
            @XmlElement(name = "rist_cena")
            protected boolean rist_cena;
            @XmlElement(name = "WiFi")
            protected boolean wiFi;
            protected boolean toilette;
            @XmlAttribute(name = "id_serv")
            protected BigInteger idServ;

            /**
             * Recupera il valore della proprietà asporto.
             * 
             */
            public boolean isAsporto() {
                return asporto;
            }

            /**
             * Imposta il valore della proprietà asporto.
             * 
             */
            public void setAsporto(boolean value) {
                this.asporto = value;
            }

            /**
             * Recupera il valore della proprietà consPosto.
             * 
             */
            public boolean isConsPosto() {
                return consPosto;
            }

            /**
             * Imposta il valore della proprietà consPosto.
             * 
             */
            public void setConsPosto(boolean value) {
                this.consPosto = value;
            }

            /**
             * Recupera il valore della proprietà serDomicilio.
             * 
             */
            public boolean isSerDomicilio() {
                return serDomicilio;
            }

            /**
             * Imposta il valore della proprietà serDomicilio.
             * 
             */
            public void setSerDomicilio(boolean value) {
                this.serDomicilio = value;
            }

            /**
             * Recupera il valore della proprietà pranzo.
             * 
             */
            public boolean isPranzo() {
                return rist_pranzo;
            }

            /**
             * Imposta il valore della proprietà pranzo.
             * 
             */
            public void setPranzo(boolean value) {
                this.rist_pranzo = value;
            }

            /**
             * Recupera il valore della proprietà cena.
             * 
             */
            public boolean isCena() {
                return rist_cena;
            }

            /**
             * Imposta il valore della proprietà cena.
             * 
             */
            public void setCena(boolean value) {
                this.rist_cena = value;
            }

            /**
             * Recupera il valore della proprietà wiFi.
             * 
             */
            public boolean isWiFi() {
                return wiFi;
            }

            /**
             * Imposta il valore della proprietà wiFi.
             * 
             */
            public void setWiFi(boolean value) {
                this.wiFi = value;
            }

            /**
             * Recupera il valore della proprietà toilette.
             * 
             */
            public boolean isToilette() {
                return toilette;
            }

            /**
             * Imposta il valore della proprietà toilette.
             * 
             */
            public void setToilette(boolean value) {
                this.toilette = value;
            }

            /**
             * Recupera il valore della proprietà idServ.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getIdServ() {
                return idServ;
            }

            /**
             * Imposta il valore della proprietà idServ.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIdServ(BigInteger value) {
                this.idServ = value;
            }

			public String toString() {
				return "Servizi [asporto=" + asporto + ", consPosto=" + consPosto + ", serDomicilio=" + serDomicilio
						+ ", pranzo=" + rist_pranzo + ", cena=" + rist_cena + ", wiFi=" + wiFi + ", toilette=" + toilette
						+ ", idServ=" + idServ + "]";
			}

        }

    }

}
