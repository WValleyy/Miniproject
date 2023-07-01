package initializer;

import java.util.ArrayList;

import virus.Virus;
import virus.envelope_virus.Covid;
import virus.envelope_virus.envelope.Envelope;

public class Initializer {
	private static ArrayList<Virus> envelopeVirusList = new ArrayList<Virus>();
	
	
	public void mainInitializer() {
		
		
		Covid covid = covidInitializer();
		envelopeVirusList.add(covid);
		
	}
	
	public Covid covidInitializer () {
		
		ArrayList<String> viralProteins = new ArrayList<>();
		
		String acidNucleic = 
			    "- The COVID-19 virus, also known as SARS-CoV-2, has a single-stranded RNA (ribonucleic acid) genome.\n" +
			    "- The RNA genome of SARS-CoV-2 is approximately 30,000 bases long.\n" +
			    "- It's worth noting that the nucleic acid sequence of SARS-CoV-2 can mutate over time, leading to the emergence of new variants.\n" +
			    "  These mutations can affect the transmissibility, severity, and response to treatments and vaccines.";

		
		String capsid = 
				"- The capsid of SARS-CoV-2 is a protein shell that protects its RNA genome.\n" +
                "- It has an icosahedral symmetry and is made up of repeating subunits of the nucleocapsid protein.\n" +
                "- The nucleocapsid protein binds tightly to the viral RNA, ensuring its stability and protecting it from degradation.\n" +
                "- The protein interacts with other viral proteins, assisting in viral replication and assembly.\n" +
                "- The capsid, along with the spike protein, facilitates the virus's entry into host cells.\n" +
                "- The nucleocapsid protein is immunogenic and triggers an immune response.\n" +
                "- Understanding the structure and function of the capsid is crucial for studying the virus and developing diagnostics, treatments, and vaccines.";
		
		String lipidBilayer = 
				"- The lipid bilayer is the outer envelope of the COVID-19 virus.\n"
		        + "- It is derived from the host cell membrane when the virus exits the infected cell.\n"
		        + "- The lipid bilayer is primarily composed of phospholipids, cholesterol, and various proteins.\n"
		        + "- Phospholipids are the main structural components of the bilayer, with hydrophilic heads facing outward and hydrophobic tails facing inward.\n"
		        + "- Cholesterol is present in the lipid bilayer, helping maintain its fluidity and stability.\n"
		        + "- The lipid bilayer contains embedded viral proteins, including spike proteins (S proteins), membrane proteins (M proteins), and envelope proteins (E proteins).\n"
		        + "- These proteins play roles in viral entry, structural integrity, and immune evasion.\n"
		        + "- The lipid bilayer allows the virus to interact with host cells, fuse with their membranes, and release its genetic material for replication.\n"
		        + "- Understanding the composition and structure of the lipid bilayer is crucial for developing antiviral drugs and vaccines targeting the virus.";
				
		String mProtein = 
				"- The M protein (membrane protein) is a structural protein found in the lipid bilayer of the COVID-19 virus.\n"
		        + "- It plays a crucial role in maintaining the structural integrity of the virus.\n"
		        + "- The M protein interacts with other viral components, such as the nucleocapsid, spike proteins, and envelope proteins.\n"
		        + "- It is involved in viral assembly and budding from infected cells.\n"
		        + "- The M protein helps shape the virus and contributes to its overall morphology.\n"
		        + "- It is essential for the virus to maintain its structure during the replication and assembly process.\n"
		        + "- The M protein also plays a role in modulating the host immune response.\n"
		        + "- It can interfere with the host's immune system to aid in viral evasion and replication.\n"
		        + "- Understanding the role and function of the M protein is crucial for studying the virus and developing targeted antiviral strategies.";

		String eProtein = 
				"- The E protein (envelope protein) is one of the structural proteins found in the lipid bilayer of the COVID-19 virus.\n"
		        + "- It is located in the lipid bilayer of the virus envelope.\n"
		        + "- The E protein is involved in several functions during the viral life cycle.\n"
		        + "- It plays a role in viral assembly and release from infected cells.\n"
		        + "- The E protein contributes to the overall structure and stability of the virus.\n"
		        + "- It participates in the formation of the viral envelope and helps maintain its shape.\n"
		        + "- The E protein also interacts with other viral proteins, such as the M protein and S protein.\n"
		        + "- It is involved in the assembly of these proteins into the viral structure.\n"
		        + "- Additionally, the E protein may play a role in modulating the host immune response.\n"
		        + "- It can influence the host's immune system to aid in viral evasion.\n"
		        + "- Understanding the functions and interactions of the E protein is crucial for studying the virus and developing targeted antiviral strategies.";

		String sProtein = "- The S protein (spike protein) is a key structural protein found on the surface of the COVID-19 virus.\n"
		        + "- It plays a crucial role in viral entry into host cells.\n"
		        + "- The S protein binds to the ACE2 receptor on the surface of human cells, facilitating viral attachment.\n"
		        + "- It enables the virus to fuse with the host cell membrane, allowing the virus to enter the cell.\n"
		        + "- The S protein is a major target for the development of COVID-19 vaccines and therapeutics.\n"
		        + "- Understanding the structure and function of the S protein is essential for vaccine design.\n"
		        + "- Mutations in the S protein can impact viral infectivity and immune recognition.\n"
		        + "- Ongoing research is focused on understanding the S protein variants and their implications for vaccine efficacy.";

		viralProteins.add(mProtein);
		viralProteins.add(eProtein);
		viralProteins.add(sProtein);
		
		Envelope envelope = new Envelope (lipidBilayer, viralProteins);
		
		Covid covid = new Covid(acidNucleic, capsid, envelope);
		
		return covid;
 
	}

	public static ArrayList<Virus> getEnvelopeVirusList() {
		return envelopeVirusList;
	}
	
	
	
}