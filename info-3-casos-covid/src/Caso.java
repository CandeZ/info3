import java.util.Date;

public class Caso {
    // variables
    private long id_evento_caso;
    private char sexo;
    private int edad;
    private String edad_años_meses;
    private String residencia_pais_nombre;
    private String residencia_provincia_nombre;
    private String residencia_departamento_nombre;
    private String carga_provincia_nombre;
    private Date fecha_inicio_sintomas;
    private Date fecha_apertura;
    private int sepi_apertura;
    private Date fecha_internacion;
    private String cuidado_intensivo;
    private Date fecha_cui_intensivo;
    private String fallecido;
    private Date fecha_fallecimiento;
    private String asistencia_respiratoria_mecanica;
    private int carga_provincia_id;
    private String origen_financiamiento;
    private String clasificacion;
    private String clasificacion_resumen;
    private int residencia_provincia_id;
    private Date fecha_diagnostico;
    private int residencia_departamento_id;
	private Date ultima_actualizacion;
	


 // constructor
    public Caso(long id_evento_caso, char sexo, int edad, String edad_años_meses, String residencia_pais_nombre,
            String residencia_provincia_nombre, String residencia_departamento_nombre, String carga_provincia_nombre,
            Date fecha_inicio_sintomas, Date fecha_apertura, int sepi_apertura, Date fecha_internacion,
            String cuidado_intensivo, Date fecha_cui_intensivo, String fallecido, Date fecha_fallecimiento,
            String asistencia_respiratoria_mecanica, int carga_provincia_id, String origen_financiamiento,
            String clasificacion, String clasificacion_resumen, int residencia_provincia_id, Date fecha_diagnostico,
            int residencia_departamento_id, Date ultima_actualizacion) {
	
		this.id_evento_caso = id_evento_caso;	
		this.sexo = sexo;
		this.edad = edad;
		this.edad_años_meses = edad_años_meses;
		this.residencia_pais_nombre = residencia_pais_nombre;		
		this.residencia_provincia_nombre = residencia_provincia_nombre;
		this.residencia_departamento_nombre = residencia_departamento_nombre;
		this.carga_provincia_nombre = carga_provincia_nombre;
		this.fecha_inicio_sintomas = fecha_inicio_sintomas;
		this.fecha_apertura = fecha_apertura;
		this.sepi_apertura = sepi_apertura;
		this.fecha_internacion = fecha_internacion;
		this.cuidado_intensivo = cuidado_intensivo;
		this.fecha_cui_intensivo = fecha_cui_intensivo;
		this.fallecido = fallecido;
		this.fecha_fallecimiento = fecha_fallecimiento;
		this.asistencia_respiratoria_mecanica = asistencia_respiratoria_mecanica;
		this.carga_provincia_id = carga_provincia_id;
		this.origen_financiamiento = origen_financiamiento;
		this.clasificacion = clasificacion;
		this.clasificacion_resumen = clasificacion_resumen;
		this.residencia_provincia_id = residencia_provincia_id;
		this.fecha_diagnostico = fecha_diagnostico;
		this.residencia_departamento_id = residencia_departamento_id;
		this.ultima_actualizacion = ultima_actualizacion;
	}
	

	public long getId_evento_caso() {
		return this.id_evento_caso;
	}


	public char getSexo() {
		return this.sexo;
	}


	public int getEdad() {
		return this.edad;
	}

	public String getEdad_añOs_meses() {
		return this.edad_años_meses;
	}


	public String getResidencia_pais_nombre() {
		return this.residencia_pais_nombre;
	}


	public String getResidencia_provincia_nombre() {
		return this.residencia_provincia_nombre;
	}


	public String getResidencia_departamento_nombre() {
		return this.residencia_departamento_nombre;
	}


	public String getCarga_provincia_nombre() {
		return this.carga_provincia_nombre;
	}


	public Date getFecha_inicio_sintomas() {
		return this.fecha_inicio_sintomas;
	}


	public Date getFecha_apertura() {
		return this.fecha_apertura;
	}


	public int getSepi_apertura() {
		return this.sepi_apertura;
	}


	public Date getFecha_internacion() {
		return this.fecha_internacion;
	}


	public String getCuidado_intensivo() {
		return this.cuidado_intensivo;
	}

	public Date getFecha_cui_intensivo() {
		return this.fecha_cui_intensivo;
	}


	public String getFallecido() {
		return this.fallecido;
	}


	public Date getFecha_fallecimiento() {
		return this.fecha_fallecimiento;
	}


	public String getAsistencia_respiratoria_mecanica() {
		return this.asistencia_respiratoria_mecanica;
	}

	public int getCarga_provincia_id() {
		return this.carga_provincia_id;
	}


	public String getOrigen_financiamiento() {
		return this.origen_financiamiento;
	}

	public String getClasificacion() {
		return this.clasificacion;
	}

	public String getClasificacion_resumen() {
		return this.clasificacion_resumen;
	}


	public int getResidencia_provincia_id() {
		return this.residencia_provincia_id;
	}


	public Date getFecha_diagnostico() {
		return this.fecha_diagnostico;
	}

	public int getResidencia_departamento_id() {
		return this.residencia_departamento_id;
	}


	public Date getUltima_actualizacion() {
		return this.ultima_actualizacion;
	}
//muestra los datos del objeto	
@Override
public String toString() {
	return "Caso{"+ id_evento_caso + " / "+ sexo+ " / "+ edad+ " "+ edad_años_meses+ " / "+ residencia_pais_nombre+ " / "+ 
	residencia_provincia_nombre+ " / "+ residencia_departamento_nombre+ " / "+ carga_provincia_nombre+ " / "+
	fecha_inicio_sintomas+ " / "+ fecha_apertura+ " / "+sepi_apertura+ " / "+ fecha_internacion+ " / "+ cuidado_intensivo+ " / "+
	fecha_cui_intensivo+ " / "+fallecido+ " / "+ fecha_fallecimiento+ " / "+ asistencia_respiratoria_mecanica+ " / "+
	carga_provincia_id+ " / "+ origen_financiamiento+ " / "+ clasificacion+ " / "+ clasificacion_resumen+ " / "+
	residencia_provincia_id+ " / "+ fecha_diagnostico+ " / "+ residencia_departamento_id+ " / "+ ultima_actualizacion+'}';

   
}
