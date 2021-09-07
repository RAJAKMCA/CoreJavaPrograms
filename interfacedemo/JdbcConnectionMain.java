package interfacedemo;

//interface will be called as API's
 interface JdbcInterface {
 void implmentDatabaseConnectivity(String datbaseImplemntation);
// void implementJavaToDbTypes(String dataTypesImplemenation);
}

 abstract class OracleJdbcConnection implements JdbcInterface{

	public void implmentDatabaseConnectivity(String datbaseImplemntation) {
		System.out.println("This JdbcDriverInterface implementation is for "+datbaseImplemntation);
		
	}
	
}
 class OracleJdbcConnectionImplemeted extends OracleJdbcConnection{

	public void implementJavaToDbTypes(String dataTypesImplemenation) {
		// TODO Auto-generated method stub
		System.out.println("This implementJavaToDbTypes abstract Implem=natation for "+dataTypesImplemenation);
	}
	 
 }
 
 class MySQLJdbcConnection implements JdbcInterface{

		public void implmentDatabaseConnectivity(String datbaseImplemntation) {
			System.out.println("This JdbcDriverInterface implementation is for "+datbaseImplemntation);
			
		}

		public void implementJavaToDbTypes(String dataTypesImplemenation) {
			System.out.println("This implementJavaToDbTypes implementation is for "+dataTypesImplemenation);
			
		}
		
	}

 public class JdbcConnectionMain{
	 public static void main(String[] args){
	 
		 OracleJdbcConnectionImplemeted ojc=new OracleJdbcConnectionImplemeted();
	 ojc.implmentDatabaseConnectivity("Oracle Database");
	 ojc.implementJavaToDbTypes("Oracle Database");
	 
	 //MySQLJdbcConnection mysqljdbc=new MySQLJdbcConnection();
	 //mysqljdbc.implmentDatabaseConnectivity(" MySQL Database");
	 //mysqljdbc.implementJavaToDbTypes(" MySQL Database");
	 
	 }
 }
 
 
 //interface for a shape inreface
 interface ShapeInterface{
	void displayShapeOfAnObject(String objectType,String corners);
 }
// Implement above interface  for Triangle and Rectangular and Hexagonal
 
