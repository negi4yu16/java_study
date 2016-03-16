package src.ch06.ex03;

public enum Verbose {
	SILENT("SILENT"),
	TERSE("TERSE"),
	NORMAL("NORMAL"),
	VERBOSE("VERBOSE");

	String name;
	Verbose(String name){
		this.name = name;
	}
}
