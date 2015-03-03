package com.ac.er;

import java.util.LinkedList;
import java.util.List;

import com.ac.er.data.Hospital;

/**
 * @author ac010168
 *
 */
public class HospitalLoader {

  public static List<Hospital> buildHospitalList() {
    List<Hospital> hospitals = new LinkedList<Hospital>();
    
    hospitals.add(buildBeltonRegionalMedicalCenter());
    hospitals.add(buildCenterpointMedicalCenter());
    hospitals.add(buildLafayetteRegionalHealthCenter());
    hospitals.add(buildLeesSummitMedicalCenter());
    hospitals.add(buildMenorahMedicalCenter());
    hospitals.add(buildOverlandParkRegionalMedicalCenter());
    hospitals.add(buildResearchMedicalCenterBrooksideCampus());
    hospitals.add(buildResearchMedicalCenter());
    
    hospitals.add(buildSaintLukesCushingHospital());
    hospitals.add(buildSaintLukesEastHospital());
    hospitals.add(buildSaintLukesHospitalOfKansasCity());
    hospitals.add(buildSaintLukesNorthHospitalSmithville());
    hospitals.add(buildSaintLukesNorthHospitalBarryRoad());
    hospitals.add(buildSaintLukesSouthHospital());
  
    hospitals.add(buildChildrensMercy());
    hospitals.add(buildChildrensMercySouth());
    
    hospitals.add(buildUniversityOfKansasHospital());
    
    hospitals.add(buildStJosephMedicalCenter());
    hospitals.add(buildStMarysMedicalCenter());
    
    hospitals.add(buildAndersonCountyHospital());
    hospitals.add(buildHeartlandRegionalMedicalCenter());
    hospitals.add(buildHendrickMedicalCenter());
    hospitals.add(buildLibertyHospital());
    hospitals.add(buildNorthKansasCityHospital());
    hospitals.add(buildProvidenceMedicalCenter());
    hospitals.add(buildShawneeMissionHealthPrairieStar());
    hospitals.add(buildShawneeMissionMedicalCenter());
    hospitals.add(buildTrumanMedicalCenterLakewood());
    hospitals.add(buildWrightMemoralHospital());
    
    return hospitals;
  }
  
  private static Hospital buildBeltonRegionalMedicalCenter() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(1000);
    hospital.setHospitalName("Belton Regional Medical Center");
    hospital.setHospitalLat(38.8140416);
    hospital.setHospitalLon(-94.5043987);
    hospital.setHospitalString("17065 S. 71 Highway Belton, MO 64012");
    hospital.setHospitalStatus("level3");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(2);
    hospital.setTraumaBedsFree(2);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(24);
    hospital.setErBedsFree(24);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildCenterpointMedicalCenter() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(1001);
    hospital.setHospitalName("Centerpoint Medical Center");
    hospital.setHospitalLat(39.0494374);
    hospital.setHospitalLon(-94.3488139);
    hospital.setHospitalString("19600 East 39th Street, Indepdence, MO 64057");
    hospital.setHospitalStatus("level2");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(2);
    hospital.setTraumaBedsFree(2);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(27);
    hospital.setErBedsFree(27);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildLafayetteRegionalHealthCenter() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(1002);
    hospital.setHospitalName("Lafayette Regional Health Center");
    hospital.setHospitalLat(39.1891475);
    hospital.setHospitalLon(-93.8762631);
    hospital.setHospitalString("1500 State Street Lexington, MO 64067");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(30);
    hospital.setErBedsFree(30);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildLeesSummitMedicalCenter() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(1003);
    hospital.setHospitalName("Lee's Summit Medical Center");
    hospital.setHospitalLat(38.90359);
    hospital.setHospitalLon(-94.3330751);
    hospital.setHospitalString("2100 SE Blue Parkway Lee's Summit, MO 64063");
    hospital.setHospitalStatus("level3");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(2);
    hospital.setTraumaBedsFree(2);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(22);
    hospital.setErBedsFree(22);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildMenorahMedicalCenter() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(1004);
    hospital.setHospitalName("Menorah Medical Center");
    hospital.setHospitalLat(38.9101407);
    hospital.setHospitalLon(-94.6524854);
    hospital.setHospitalString("5721 W. 119th Street Overland Park, KS 66209");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(26);
    hospital.setErBedsFree(26);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildOverlandParkRegionalMedicalCenter() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(1005);
    hospital.setHospitalName("Overland Park Regional Medical Center");
    hospital.setHospitalLat(38.9371818);
    hospital.setHospitalLon(-94.7253632);
    hospital.setHospitalString("10500 Quivira Road Overland Park, KS 66215");
    hospital.setHospitalStatus("level2");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(3);
    hospital.setTraumaBedsFree(3);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(29);
    hospital.setErBedsFree(29);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildResearchMedicalCenterBrooksideCampus() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(1006);
    hospital.setHospitalName("Research Medical Center - Brookside Campus");
    hospital.setHospitalLat(39.0069946);
    hospital.setHospitalLon(-94.5772109);
    hospital.setHospitalString("6601 Rockhill Road, Kansas City, MO");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(31);
    hospital.setErBedsFree(31);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildResearchMedicalCenter() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(1007);
    hospital.setHospitalName("Research Medical Center");
    hospital.setHospitalLat(39.0084782);
    hospital.setHospitalLon(-94.5580436);
    hospital.setHospitalString("2316 E Meyer Blvd Kansas City, MO 64132");
    hospital.setHospitalStatus("level1");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(3);
    hospital.setTraumaBedsFree(3);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(32);
    hospital.setErBedsFree(32);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  

  
  
  
  private static Hospital buildSaintLukesCushingHospital() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(2000);
    hospital.setHospitalName("Saint Luke's Cushing Hospital");
    hospital.setHospitalLat(39.307297);
    hospital.setHospitalLon(-94.918431);
    hospital.setHospitalString("711 Marshall St. Leavenworth, KS 66048");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(41);
    hospital.setErBedsFree(41);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildSaintLukesEastHospital() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(2001);
    hospital.setHospitalName("Saint Luke's East Hosptial");
    hospital.setHospitalLat(38.9420549);
    hospital.setHospitalLon(-94.3815712);
    hospital.setHospitalString("100 N.E. Saint Luke's Blvd. Lee's Summit, MO 64086");
    hospital.setHospitalStatus("level3");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(2);
    hospital.setTraumaBedsFree(2);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(33);
    hospital.setErBedsFree(33);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildSaintLukesHospitalOfKansasCity() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(2002);
    hospital.setHospitalName("Saint Luke's Hospital of Kansas City");
    hospital.setHospitalLat(39.0476376);
    hospital.setHospitalLon(-94.5903088);
    hospital.setHospitalString("4401 Wornall Road Kansas City, MO 64111");
    hospital.setHospitalStatus("level1");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(5);
    hospital.setTraumaBedsFree(5);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(28);
    hospital.setErBedsFree(28);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildSaintLukesNorthHospitalBarryRoad() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(2003);
    hospital.setHospitalName("Saint Luke's North Hospital - Barry Road");
    hospital.setHospitalLat(39.248877);
    hospital.setHospitalLon(-94.648331);
    hospital.setHospitalString("5830 N.W. Barry Road Kansas City, MO 64154");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(35);
    hospital.setErBedsFree(35);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildSaintLukesNorthHospitalSmithville() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(2004);
    hospital.setHospitalName("Saint Luke's North Hospital - Smithville");
    hospital.setHospitalLat(39.3765434);
    hospital.setHospitalLon(-94.5812193);
    hospital.setHospitalString("601 S. 169 Highway Smithville, MO 64089");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(21);
    hospital.setErBedsFree(21);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildSaintLukesSouthHospital() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(2005);
    hospital.setHospitalName("Saint Luke's South Hospital");
    hospital.setHospitalLat(39.0084782);
    hospital.setHospitalLon(-94.5580436);
    hospital.setHospitalString("12300 Metcalf Ave. Overland Park, KS 66213");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(31);
    hospital.setErBedsFree(31);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildChildrensMercy() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(3000);
    hospital.setHospitalName("Children's Mercy Hospital");
    hospital.setHospitalLat(39.0841305);
    hospital.setHospitalLon(-94.5771441);
    hospital.setHospitalString("2401 Gillham Road, Kansas City, MO 64108");
    hospital.setHospitalStatus("level1");
    String[] ages = {"child", "teen"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(3);
    hospital.setTraumaBedsFree(3);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(40);
    hospital.setErBedsFree(40);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildChildrensMercySouth() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(3001);
    hospital.setHospitalName("Children's Mercy South");
    hospital.setHospitalLat(38.9298785);
    hospital.setHospitalLon(-94.6523746);
    hospital.setHospitalString("5808 W. 110th Overland Park, KS 66211");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(25);
    hospital.setErBedsFree(25);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildUniversityOfKansasHospital() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(4000);
    hospital.setHospitalName("University of Kansas Hospital");
    hospital.setHospitalLat(39.0561921);
    hospital.setHospitalLon(-94.6114044);
    hospital.setHospitalString("3901 Rainbow Boulevard Kansas City, Kansas 66160");
    hospital.setHospitalStatus("level1");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(2);
    hospital.setTraumaBedsFree(2);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(25);
    hospital.setErBedsFree(40);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }

  private static Hospital buildStJosephMedicalCenter() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(5000);
    hospital.setHospitalName("St. Joseph Medical Center");
    hospital.setHospitalLat(38.9356797);
    hospital.setHospitalLon(-94.6046903);
    hospital.setHospitalString("1000 Carondelet Dr, Kansas City, MO 64114");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(27);
    hospital.setErBedsFree(27);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildStMarysMedicalCenter() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(5001);
    hospital.setHospitalName("St. Mary's Medical Center");
    hospital.setHospitalLat(39.0253623);
    hospital.setHospitalLon(-94.264405);
    hospital.setHospitalString("201 NW R.D. Mize Road Blue Springs, MO 64014");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(25);
    hospital.setErBedsFree(25);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }

  private static Hospital buildAndersonCountyHospital() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(6000);
    hospital.setHospitalName("Anderson County Hospital");
    hospital.setHospitalLat(38.2799108);
    hospital.setHospitalLon(-95.2501057);
    hospital.setHospitalString("421 S. Maple Garnett, KS 66032");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(16);
    hospital.setErBedsFree(16);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildHeartlandRegionalMedicalCenter() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(6001);
    hospital.setHospitalName("Heartland Regional Medical Center");
    hospital.setHospitalLat(39.7732177);
    hospital.setHospitalLon(-94.7708764);
    hospital.setHospitalString("5325 Faroan Street St. Joseph, MO 64506");
    hospital.setHospitalStatus("level2");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(2);
    hospital.setTraumaBedsFree(2);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(26);
    hospital.setErBedsFree(26);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildHendrickMedicalCenter() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(6002);
    hospital.setHospitalName("Hendrick Medical Center");
    hospital.setHospitalLat(39.8188046);
    hospital.setHospitalLon(-93.5522352);
    hospital.setHospitalString("2799 N. Washington St. Chillicothe, MO 64601");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(16);
    hospital.setErBedsFree(16);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildLibertyHospital() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(6003);
    hospital.setHospitalName("Liberty Hospital");
    hospital.setHospitalLat(39.2747471);
    hospital.setHospitalLon(-94.4243895);
    hospital.setHospitalString("2525 Glenn Hendren Drive Liberty, MO 64068");
    hospital.setHospitalStatus("level2");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(3);
    hospital.setTraumaBedsFree(3);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(25);
    hospital.setErBedsFree(25);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildNorthKansasCityHospital() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(6004);
    hospital.setHospitalName("North Kansas City Hospital");
    hospital.setHospitalLat(39.149565);
    hospital.setHospitalLon(-94.551603);
    hospital.setHospitalString("2800 Clay Edwards Drive, North Kansas City, MO");
    hospital.setHospitalStatus("level2");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(3);
    hospital.setTraumaBedsFree(3);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(24);
    hospital.setErBedsFree(24);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildProvidenceMedicalCenter() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(6005);
    hospital.setHospitalName("Providence Medical Center");
    hospital.setHospitalLat(39.1265615);
    hospital.setHospitalLon(-94.7866525);
    hospital.setHospitalString("8929 Parallel Parkway Kansas City, KS 66112");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(23);
    hospital.setErBedsFree(23);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildShawneeMissionHealthPrairieStar() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(6006);
    hospital.setHospitalName("Shawnee Mission Health - Prairie Star");
    hospital.setHospitalLat(38.9550445);
    hospital.setHospitalLon(-94.8571287);
    hospital.setHospitalString("23401 Prairie Star Parkway Lenexa, Kansas 66227 ");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(21);
    hospital.setErBedsFree(21);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildShawneeMissionMedicalCenter() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(6007);
    hospital.setHospitalName("Shawnee Mission Medical Center");
    hospital.setHospitalLat(39.0253623);
    hospital.setHospitalLon(-94.264405);
    hospital.setHospitalString("9100 West 74th Street Shawnee Mission, Kansas 66204");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(23);
    hospital.setErBedsFree(23);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildTrumanMedicalCenterLakewood() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(6008);
    hospital.setHospitalName("Truman Medical Center Lakewood");
    hospital.setHospitalLat(38.9757573);
    hospital.setHospitalLon(-94.3946152);
    hospital.setHospitalString("7900 Lee's Summit Rd, Kansas City, MO");
    hospital.setHospitalStatus("level1");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(3);
    hospital.setTraumaBedsFree(3);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(49);
    hospital.setErBedsFree(49);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
  
  private static Hospital buildWrightMemoralHospital() {
    Hospital hospital = new Hospital();
    hospital.setHospitalID(6009);
    hospital.setHospitalName("Wright Memoral Hospital");
    hospital.setHospitalLat(40.0676321);
    hospital.setHospitalLon(-93.5820152);
    hospital.setHospitalString("191 Iowa Blvd. Trenton, MO 64683");
    hospital.setHospitalStatus("basicER");
    String[] ages = {"child", "teen", "adult"};
    hospital.setHostAges(ages);
    hospital.setTraumaBeds(0);
    hospital.setTraumaBedsFree(0);
    hospital.setTraumaBedsOccupied(0);
    hospital.setTraumaBedsCleanup(0);
    hospital.setErBeds(19);
    hospital.setErBedsFree(19);
    hospital.setErBedsOccupied(0);
    hospital.setErBedsCleanup(0);
    return hospital;
  }
}
