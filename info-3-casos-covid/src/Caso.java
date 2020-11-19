import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Caso {
    // variables
    private String id_evento_caso;
    private String sexo;
    private String edad;
    private String edad_años_meses;
    private String residencia_pais_nombre;
    private String residencia_provincia_nombre;
    private String residencia_departamento_nombre;
    private String carga_provincia_nombre;
    private String fecha_inicio_sintomas;
    private String fecha_apertura;
    private String sepi_apertura;
    private String fecha_internacion;
    private String cuidado_intensivo;
    private String fecha_cui_intensivo;
    private String fallecido;
    private String fecha_fallecimiento;
    private String asistencia_respiratoria_mecanica;
    private String carga_provincia_id;
    private String origen_financiamiento;
    private String clasificacion;
    private String clasificacion_resumen;
    private String residencia_provincia_id;
    private String fecha_diagnostico;
    private String residencia_departamento_id;
	private String ultima_actualizacion;
	


 // constructor
    public Caso(String id_evento_caso, String sexo, String edad, String edad_años_meses, String residencia_pais_nombre,
            String residencia_provincia_nombre, String residencia_departamento_nombre, String carga_provincia_nombre,
            String fecha_inicio_sintomas, String fecha_apertura, String sepi_apertura, String fecha_internacion,
            String cuidado_intensivo, String fecha_cui_intensivo, String fallecido, String fecha_fallecimiento,
            String asistencia_respiratoria_mecanica, String carga_provincia_id, String origen_financiamiento,
            String clasificacion, String clasificacion_resumen, String residencia_provincia_id, String fecha_diagnostico,
            String residencia_departamento_id, String ultima_actualizacion) {
	
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
	

	public String getId_evento_caso() {
		return this.id_evento_caso;
	}

	public String getSexo() {
		return this.sexo;
	}

	public String getEdad() {
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

	public String getFecha_inicio_sintomas() {
		return this.fecha_inicio_sintomas;
	}

	public String getFecha_apertura() {
		return this.fecha_apertura;
	}

	public String getSepi_apertura() {
		return this.sepi_apertura;
	}

	public String getFecha_internacion() {
		return this.fecha_internacion;
	}

	public String getCuidado_intensivo() {
		return this.cuidado_intensivo;
	}

	public String getFecha_cui_intensivo() {
		return this.fecha_cui_intensivo;
	}

	public String getFallecido() {
		return this.fallecido;
	}

	public String  getFecha_fallecimiento() {
		return this.fecha_fallecimiento;
	}

	public String getAsistencia_respiratoria_mecanica() {
		return this.asistencia_respiratoria_mecanica;
	}

	public String getCarga_provincia_id() {
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

	public String getResidencia_provincia_id() {
		return this.residencia_provincia_id;
	}

	public String getFecha_diagnostico() {
		return this.fecha_diagnostico;
	}

	public String getResidencia_departamento_id() {
		return this.residencia_departamento_id;
	}

	public String getUltima_actualizacion() {
		return this.ultima_actualizacion;
	}

	public List lectorcsv() throws FileNotFoundException, IOException 
	{ 
		
		List casos = new ArrayList<>(); 

		BufferedReader lectorcsv = new BufferedReader(new FileReader("Covid19Casos.txt.gz")); 
		String line = lectorcsv.readLine();
	
		while ((line = lectorcsv.readLine()) != null && !line.isEmpty()) 
		{ 

			String[] tipo_dato = line.split(",");
			Caso muestra = new Caso (id_evento_caso, sexo, edad, edad_años_meses, residencia_pais_nombre,
			residencia_provincia_id, residencia_departamento_id, carga_provincia_nombre, fecha_inicio_sintomas,
			fecha_apertura, sepi_apertura, fecha_internacion, cuidado_intensivo, fecha_cui_intensivo,
			fallecido, fecha_fallecimiento, asistencia_respiratoria_mecanica, carga_provincia_id, 
			origen_financiamiento, clasificacion, clasificacion_resumen, residencia_provincia_id,
			fecha_diagnostico, residencia_departamento_id, ultima_actualizacion);
	
			
			 
			
			id_evento_caso = tipo_dato[0];
			sexo = tipo_dato[1];
			edad = tipo_dato[2];
			edad_años_meses = tipo_dato[3];
			residencia_pais_nombre = tipo_dato[4];
			residencia_provincia_id = tipo_dato[5];
			residencia_departamento_id = tipo_dato[6];
			carga_provincia_nombre= tipo_dato[7];
			fecha_inicio_sintomas= tipo_dato[8];
			fecha_apertura= tipo_dato[9];
			sepi_apertura= tipo_dato[10];
			fecha_internacion= tipo_dato[11];
			cuidado_intensivo= tipo_dato[12];
			fecha_cui_intensivo= tipo_dato[13];
			fallecido= tipo_dato[14];
			fecha_fallecimiento= tipo_dato[15];
			asistencia_respiratoria_mecanica= tipo_dato[16];
			carga_provincia_id= tipo_dato[17];
			origen_financiamiento= tipo_dato[18];
			clasificacion= tipo_dato[19];
			clasificacion_resumen= tipo_dato[20];
			residencia_provincia_id= tipo_dato[21];
			fecha_diagnostico= tipo_dato[22];
			residencia_departamento_id= tipo_dato[23];
			ultima_actualizacion= tipo_dato[24];
			
			
			casos.add(muestra);
		} 
		 	lectorcsv.close();
		return casos; 
	
	}

	
//muestra los datos del objeto	
@Override
public String toString() 
{
	return "Caso{"+ id_evento_caso + " / "+ sexo+ " / "+ edad+ " "+ edad_años_meses+ " / "+ residencia_pais_nombre+ " / "+ 
	residencia_provincia_nombre+ " / "+ residencia_departamento_nombre+ " / "+ carga_provincia_nombre+ " / "+
	fecha_inicio_sintomas+ " / "+ fecha_apertura+ " / "+sepi_apertura+ " / "+ fecha_internacion+ " / "+ cuidado_intensivo+ " / "+
	fecha_cui_intensivo+ " / "+fallecido+ " / "+ fecha_fallecimiento+ " / "+ asistencia_respiratoria_mecanica+ " / "+
	carga_provincia_id+ " / "+ origen_financiamiento+ " / "+ clasificacion+ " / "+ clasificacion_resumen+ " / "+
	residencia_provincia_id+ " / "+ fecha_diagnostico+ " / "+ residencia_departamento_id+ " / "+ ultima_actualizacion+'}';

   
}
}