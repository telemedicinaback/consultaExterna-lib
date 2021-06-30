package net.amentum.niomedic.consultaExternalib;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

//definicion de los atributos del view
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Programa de salud")
//Implementacion de la interfaz serializable para que se pueda enviar y recibir por medio de la red
public class ConsultaExternaView implements Serializable {

    //IDENTIFICACION DE LA UNIDAD
    private String clues;
    //DATOS DEL PRESTADOR DE SERVICIOS
    private String curpPrestador;
    private String nombrePrestador;
    private String primerApellidoPrestador;
    private String segundoApellidoPrestador;
    private Integer tipoPersonal;
    private String cedulaProfesional;
    private String cedulaProfesionalExtranjera;
    //DATOS DEL PACIENTE
    private String curpPaciente;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String fechaNacimiento;
    private String entidadNacimiento;
    private Integer edad;
    private Integer claveEdad;
    private Integer sexo;
    private Integer seConsideraIndigena;
    private Integer seAutodenominaAfroamericano;
    private Integer genero;
    private Integer noExpediente;
    //DERECHOHABIENCIA
    private Integer spssInsabi;
    private String numeroAfiliacionSpssInsabi;
    private Integer programaSMyMG;
    private Integer imss;
    private String numeroAfiliacionImss;
    private Integer issste;
    private String numeroAfiliacionIssste;
    private Integer otraAfiliacion;
    private String numeroOtraAfiliacion;
    //CONSULTA, SOMATOMETRÍA Y OTRAS MEDICIONES
    private String fechaConsulta;
    private Integer servicioAtencion;
    private String peso;
    private String talla;
    private String imc;
    private String circunferenciaCintura;
    private String sistolica;
    private String diastolica;
    private String frecuenciaCardiaca;
    private String frecuenciaRespiratoria;
    private String temperatura;
    private String saturacionOxigeno;
    private String glucemia;
    private String tipoMedicion;
    private String numeroTirasControlUtilizadas;
    private String embarazadaSinDiabetes;
    private Integer primeraVezAnio;
    private Integer primeraVezUnemeSaih;
    private Integer tipoDificultad;
    private Integer gradoDificultad;
    private Integer origenDificultad;
    private Integer migrante;
    private Integer relacionTemporal;
    private String descripcionDiagnostico1;
    private Integer suiveCausesDiagnostico1;
    private String codigoCIEDiagnostico1;
    private String descripcionDiagnostico2;
    private Integer primeraVezDiagnostiCo2;
    private Integer suiveCausesDiagnostico2;
    private String codigoCIEDiagnostico2;
    private String descripcionDiagnostico3;
    private Integer primeraVezDiagnostiCo3;
    private Integer suiveCausesDiagnostico3;
    private String codigoCIEDiagnostico3;
    private String folioReceta;
    private String programa;
    private Integer imc1019;
    private Integer sintomaticoRespiratorioTb;
    //SALUD REPRODUCTIVA
    private Integer atencionPregestacionalRT;
    private String riesgo;
    //ATENCION PRENATAL
    private Integer relacionTemporalIEmbarazo;
    private Integer trimestreGestacional;
    private Integer primeraVezAltoRiesgo;
    private Integer complicacionPorDiabetes;
    private Integer complicacionPorInfeccionUrinaria;
    private Integer complicacionPorPreenclampciaEclampsia;
    private Integer complicacionPorHemorragia;
    private Integer otrasAccAnalisisClinicos;
    private Integer otrasAccPrescAcidoFolico;
    private Integer otrasAccApoyoTranslado;
    //PUERPERIO
    private Integer puerpera;
    private Integer infeccionPuerpera;
    //OTROS EVENTOS
    private Integer terapiaHormonal;
    private Integer periPostMenopausia;
    private Integer its;
    private Integer patologiaMamariaBenigna;
    private Integer cancerMamario;
    private Integer colposcopia;
    private Integer cancerCervicouterino;
    //SALUD DEL NIÑO
    private Integer ninoSanoRT;
    private Integer pesoParaTalla;
    private Integer imc519;
    private Integer pruebaEDI;
    private Integer resultadoEDI;
    private Integer resultadoBatelle;
    //CÁNCER EN MENORES DE 18 AÑOS
    private Integer aplicacionCedulaCancer;
    private Integer confirmacionCancer;
    // ENFERMEDADES DIARREICAS AGUDAS (EDA’S)
    private Integer edasRT;
    private Integer edasPlanTratamiento;
    private Integer recuperadoDeshidratacion;
    private Integer numeroSobresVSOTratamiento;
    private Integer numeroSobresVSOPromocion;
    //INFECCIONES RESPIRATORIAS AGUDAS IRA´S
    private Integer irasRT;
    private Integer irasPlanTratamiento;
    private Integer neumoniaRT;
    //PREVENCIÓN DE ACCIDENTES
    private Integer informacionPrevencionAccidentes;
    //PROMOCIÓN DE LA SALUD
    private Integer lineaVida;
    private Integer cartillaSalud;
    //REFERENCIA Y CONTRARREFERENCIA
    private Integer referidoPor;
    private Integer contraReferido;
    //TELEMEDICINA
    private Integer telemedicina;
    //SEGUIMIENTO
    private String fechaProximaCita;

    private String estadoAbreviado;
    private String claveCorta;
    
    private Integer idConsulta;

    @Override
    public String toString() {
        return "ConsultaExterna {" +
                //IDENTIFICACION DE LA UNIDAD
                "clues=" + clues +
                //DATOS DEL PRESTADOR DE SERVICIOS
                ", curpPrestador=" + curpPrestador +
                ", nombrePrestador=" + nombrePrestador +
                ", primerApellidoPrestador=" + primerApellidoPrestador +
                ", segundoApellidoPrestador=" + segundoApellidoPrestador +
                ", tipoPersonal=" + tipoPersonal +
                ", cedulaProfesional=" + cedulaProfesional +
                ", cedulaProfesionalExtranjera=" + cedulaProfesionalExtranjera +
                //DATOS DEL PACIENTE
                ", curpPaciente=" + curpPaciente +
                ", nombre=" + nombre +
                ", primerApellido=" + primerApellido +
                ", segundoApellido= " + segundoApellido +
                ", fechaNacimiento=" + fechaNacimiento +
                ", entidadNacimiento=" + entidadNacimiento +
                ", edad=" + edad +
                ", claveEdad=" + claveEdad +
                ", sexo=" + sexo +
                ", seConsideraIndigena=" + seConsideraIndigena +
                ", seAutodenominaAfroamericano=" + seAutodenominaAfroamericano +
                ", genero=" + genero +
                ", noExpediente=" + noExpediente +
                //DERECHOHABIENCIA
                ", spssInsabi=" + spssInsabi +
                ", numeroAfiliacionSpssInsabi=" + numeroAfiliacionSpssInsabi +
                ", programaSMyMG=" + programaSMyMG +
                ", imss=" + imss +
                ", numeroAfiliacionImss=" + numeroAfiliacionImss +
                ", issste=" + issste +
                ", numeroAfiliacionIssste=" + numeroAfiliacionIssste +
                ", otraAfiliacion=" + otraAfiliacion +
                ",numeroOtraAfiliacion=" + numeroOtraAfiliacion +
                //CONSULTA, SOMATOMETRÍA Y OTRAS MEDICIONES
                ", fechaConsulta=" + fechaConsulta +
                ", servicioAtencion=" + servicioAtencion +
                ", peso=" + peso +
                ", talla=" + talla +
                ", imc=" + imc +
                ", circunferenciaCintura=" + circunferenciaCintura +
                ", sistolica=" + sistolica +
                ", diastolica=" + diastolica +
                ", frecuenciaCardiaca=" + frecuenciaCardiaca +
                ", frecuenciaRespiratoria=" + frecuenciaRespiratoria +
                ", temperatura=" + temperatura +
                ", saturacionOxigeno=" + saturacionOxigeno +
                ", glucemia=" + glucemia +
                ", tipoMedicion=" + tipoMedicion +
                ", numeroTirasControlUtilizadas=" + numeroTirasControlUtilizadas +
                ", embarazadaSinDiabetes=" + embarazadaSinDiabetes +
                ", primeraVezAnio=" + primeraVezAnio +
                ", primeraVezUnemeSaih=" + primeraVezUnemeSaih +
                ", tipoDificultad=" + tipoDificultad +
                ", gradoDificultad=" + gradoDificultad +
                ", origenDificultad=" + origenDificultad +
                ", migrante=" + migrante +
                ", relacionTemporal=" + relacionTemporal +
                ", descripcionDiagnostico1=" + descripcionDiagnostico1 +
                ", suiveCausesDiagnostico1=" + suiveCausesDiagnostico1 +
                ", codigoCIEDiagnostico1=" + codigoCIEDiagnostico3 +
                ", descripcionDiagnostico2=" + descripcionDiagnostico2 +
                ", primeraVezDiagnostiCo2="+primeraVezDiagnostiCo2+
                ", suiveCausesDiagnostico2=" + suiveCausesDiagnostico2 +
                ", codigoCIEDiagnostico2=" + codigoCIEDiagnostico2 +
                ", descripcionDiagnostico3=" + descripcionDiagnostico3 +
                ", primeraVezDiagnostiCo3="+primeraVezDiagnostiCo3+
                ", suiveCausesDiagnostico3=" + suiveCausesDiagnostico2 +
                ", codigoCIEDiagnostico3=" + codigoCIEDiagnostico3 +
                ", folioReceta=" + folioReceta +
                ", programa=" + programa +
                ", imc1019=" + imc1019 +
                ", sintomaticoRespiratorioTb=" + sintomaticoRespiratorioTb +


                //SALUD REPRODUCTIVA
                ", atencionPregestacionalRT=" + atencionPregestacionalRT +
                ", riesgo=" + riesgo +
                //ATENCION PRENATAL
                ", relacionTemporalIEmbarazo=" + relacionTemporalIEmbarazo +
                ", trimestreGestacional=" + trimestreGestacional +
                ", primeraVezAltoRiesgo=" + primeraVezAltoRiesgo +
                ", complicacionPorDiabetes=" + complicacionPorDiabetes +
                ", complicacionPorInfeccionUrinaria=" + complicacionPorInfeccionUrinaria +
                ", complicacionPorPreenclampciaEclampsia=" + complicacionPorPreenclampciaEclampsia +
                ", complicacionPorHemorragia=" + complicacionPorHemorragia +
                ", otrasAccAnalisisClinicos=" + otrasAccAnalisisClinicos +
                ", otrasAccPrescAcidoFolico=" + otrasAccPrescAcidoFolico +
                ", otrasAccApoyoTranslado=" + otrasAccApoyoTranslado +
                //PUERPERIO
                ", puerpera=" +puerpera +
                ", infeccionPuerpera=" + infeccionPuerpera +
                //OTROS EVENTOS
                " , terapiaHormonal=" + terapiaHormonal +
                ", periPostMenopausia=" + periPostMenopausia +
                ", its=" + its +
                ", patologiaMamariaBenigna=" + patologiaMamariaBenigna +
                ", cancerMamario=" + cancerMamario +
                ", colposcopia=" + colposcopia +
                ", cancerCervicouterino=" + cancerCervicouterino +
                //SALUD DEL NIÑO
                ", ninoSanoRT=" + ninoSanoRT +
                ", pesoParaTalla=" + pesoParaTalla +
                ", imc519=" + imc519 +
                ", pruebaEDI=" + pruebaEDI +
                ", resultadoEDI=" + resultadoEDI +
                ", resultadoBattelle=" + resultadoBatelle +
                //CÁNCER EN MENORES DE 18 AÑOS
                ", aplicacionCedulaCancer=" + aplicacionCedulaCancer +
                ", confirmacionCancer=" + confirmacionCancer +
                // ENFERMEDADES DIARREICAS AGUDAS (EDA’S)
                ", edasRT=" + edasRT +
                ", edasPlanTratamiento=" + edasPlanTratamiento +
                ", recuperadoDeshidratacion=" + recuperadoDeshidratacion +
                ", numeroSobresVSOTratamiento=" + numeroSobresVSOTratamiento +
                ", numeroSobresVSOPromocion=" + numeroSobresVSOPromocion +
                //INFECCIONES RESPIRATORIAS AGUDAS IRA´S
                ", irasRT=" + irasRT +
                ", irasPlanTratamiento=" + irasPlanTratamiento +
                ", neumoniaRT=" + neumoniaRT +
                //PREVENCIÓN DE ACCIDENTES
                ", informacionPrevencionAccidentes=" + informacionPrevencionAccidentes +
                //PROMOCIÓN DE LA SALUD
                ", lineaVida=" + lineaVida +
                ", cartillaSalud=" + cartillaSalud +
                //REFERENCIA Y CONTRARREFERENCIA
                ", referidoPor=" + referidoPor +
                ", contraReferido=" + contraReferido +
                //TELEMEDICINA
                ", telemedicina=" + telemedicina +
                //SEGUIMIENTO
                ", fechaProximaCita=" + fechaProximaCita +
                ", estadoAbreviado=" + estadoAbreviado +
                ", claveCorta=" + claveCorta +
                ", idConsulta='"+idConsulta+'\''+

        "}";
    }
}
