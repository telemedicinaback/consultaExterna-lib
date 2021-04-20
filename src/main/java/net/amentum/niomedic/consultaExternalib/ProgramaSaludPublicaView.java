package net.amentum.niomedic.consultaExternalib;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

//definicion de los atributos del view
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Programa de salud")
//Implementacion de la interfaz serializable para que se pueda enviar y recibir por medio de la red
public class ProgramaSaludPublicaView implements Serializable {

/*    //IDENTIFICACION DE LA UNIDAD
    @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true)
    private String clues;

    //DATOS DEL PRESTADOR DE SERVICIOS
    @ApiModelProperty(allowEmptyValue = true)
    private String curpPrestador;

    @ApiModelProperty(allowEmptyValue = true)
    private String nombrePrestador;

    @ApiModelProperty(allowEmptyValue = true)
    private String primerApellidoPrestador;

    @ApiModelProperty(allowEmptyValue = true)
    private String segundoApellidoPrestador;

    @ApiModelProperty(required = true, allowEmptyValue = true)
    private Integer tipoPersonal;

    @ApiModelProperty(allowEmptyValue = true)
    private String cedulaProfesional;

    @ApiModelProperty(allowEmptyValue = true)
    private String cedulaProfesionalExtranjera;

    //DATOS DEL PACIENTE
    @ApiModelProperty(allowEmptyValue = true)
    private String curpPaciente;

    @ApiModelProperty(allowEmptyValue = true)
    private String nombre;

    @ApiModelProperty(allowEmptyValue = true)
    private String primerApellido;

    @ApiModelProperty(allowEmptyValue = true)
    private String segundoApellido;

    @ApiModelProperty(allowEmptyValue = true)
    private String fechaNacimiento;

    @ApiModelProperty(allowEmptyValue = true)
    private String entidadNacimiento;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer edad;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer claveEdad;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer sexo;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer seConsideraIndigena;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer seAutodenominaAfroamericano;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer genero;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer noExpediente;

    //DERECHOHABIENCIA
    @ApiModelProperty(allowEmptyValue = true)
    private Integer spssInsabi;

    @ApiModelProperty(allowEmptyValue = true)
    private String numeroAfiliacionSpssInsabi;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer programaSMyMG;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer imss;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer numeroAfiliacionImss;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer issste;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer numeroAfiliacionIssste;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer otraAfiliacion;

    @ApiModelProperty(allowEmptyValue = true)
    private String numeroOtraAfiliacion;

    //CONSULTA, SOMATOMETRÍA Y OTRAS MEDICIONES
    @ApiModelProperty(allowEmptyValue = true)
    private String fechaConsulta;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer servicioAtencion;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer peso;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer talla;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer imc;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer circunferenciaCintura;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer sistolica;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer diastolica;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer frecuenciaCardiaca;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer frecuenciaRespiratoria;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer temperatura;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer saturacionOxigeno;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer glucemia;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer tipoMedicion;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer numeroTirasControlUtilizadas;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer embarazadaSinDiabetes;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer primeraVezAnio;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer primeraVezUnemeSaih;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer tipoDificultad;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer gradoDificultad;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer origenDificultad;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer migrante;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer relacionTemporal;

    @ApiModelProperty(allowEmptyValue = true)
    private String descripcionDiagnostico1;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer suiveCausesDiagnostico1;

    @ApiModelProperty(allowEmptyValue = true)
    private String codigoCIEDiagnostico1;

    @ApiModelProperty(allowEmptyValue = true)
    private String descripcionDiagnostico2;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer primeraVezDiagnostiCo2;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer suiveCausesDiagnostico2;

    @ApiModelProperty(allowEmptyValue = true)
    private String codigoCIEDiagnostico2;

    @ApiModelProperty(allowEmptyValue = true)
    private String descripcionDiagnostico3;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer primeraVezDiagnostiCo3;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer suiveCausesDiagnostico3;

    @ApiModelProperty(allowEmptyValue = true)
    private String codigoCIEDiagnostico3;

    @ApiModelProperty(allowEmptyValue = true)
    private String folioReceta;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer programa;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer imc1019;

    @ApiModelProperty(allowEmptyValue = true)
    private Int*//*eger sintomaticoRespiratorioTb;*/

    //definicion de los campos y propiedades para la tabla desc-puesto

    @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
    private Integer idProgramaSaludPublica;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer idConsulta;

    //SALUD REPRODUCTIVA
    @ApiModelProperty(allowEmptyValue = true)
    private Integer atencionPregestacionalRT;

    @ApiModelProperty(allowEmptyValue = true)
    private String riesgo;

    //ATENCION PRENATAL
    @ApiModelProperty(allowEmptyValue = true)
    private Integer relacionTemporalIEmbarazo;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer trimestreGestacional;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer primeraVezAltoRiesgo;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer complicacionPorDiabetes;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer complicacionPorInfeccionUrinaria;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer complicacionPorPreenclampciaEclampsia;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer complicacionPorHemorragia;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer otrasAccAnalisisClinicos;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer otrasAccPrescAcidoFolico;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer otrasAccApoyoTranslado;

    //PUERPERIO
    @ApiModelProperty(allowEmptyValue = true)
    private Integer puerpera;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer infeccionPuerpera;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer aceptaPF;

    //OTROS EVENTOS
    @ApiModelProperty(allowEmptyValue = true)
    private Integer terapiaHormonal;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer periPostMenopausia;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer its;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer patologiaMamariaBenigna;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer cancerMamario;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer colposcopia;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer cancerCervicouterino;

    //SALUD DEL NIÑO
    @ApiModelProperty(allowEmptyValue = true)
    private Integer ninoSanoRT;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer pesoParaTalla;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer imc519;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer pruebaEDI;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer resultadoEDI;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer resultadoBatelle;

    //CÁNCER EN MENORES DE 18 AÑOS
    @ApiModelProperty(allowEmptyValue = true)
    private Integer aplicacionCedulaCancer;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer confirmacionCancer;

    // ENFERMEDADES DIARREICAS AGUDAS (EDA’S)
    @ApiModelProperty(allowEmptyValue = true)
    private Integer edasRT;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer edasPlanTratamiento;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer recuperadoDeshidratacion;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer numeroSobresVSOTratamiento;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer numeroSobresVSOPromocion;

    //INFECCIONES RESPIRATORIAS AGUDAS IRA´S
    @ApiModelProperty(allowEmptyValue = true)
    private Integer irasRT;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer irasPlanTratamiento;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer neumoniaRT;

    //PREVENCIÓN DE ACCIDENTES
    @ApiModelProperty(allowEmptyValue = true)
    private Integer informacionPrevencionAccidentes;

    //PROMOCIÓN DE LA SALUD
    @ApiModelProperty(allowEmptyValue = true)
    private Integer lineaVida;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer cartillaSalud;

    //REFERENCIA Y CONTRARREFERENCIA
    @ApiModelProperty(allowEmptyValue = true)
    private Integer referidoPor;

    @ApiModelProperty(allowEmptyValue = true)
    private Integer contraReferido;

    //TELEMEDICINA
    @ApiModelProperty(allowEmptyValue = true)
    private Integer telemedicina;

    //SEGUIMIENTO
    @ApiModelProperty(allowEmptyValue = true)
    private String fechaProximaCita;

    @Override
    public String toString() {
        return "ConsultaExterna {" +
               /* //IDENTIFICACION DE LA UNIDAD
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
                ", sintomaticoRespiratorioTb=" + sintomaticoRespiratorioTb ++


 */               //SALUD REPRODUCTIVA
                ", idProgramaSaludPublica="+idProgramaSaludPublica+
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
                ", aceptaPF="+aceptaPF+
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
                ", fechaProximaCita=" + fechaProximaCita + "}";
    }
}
