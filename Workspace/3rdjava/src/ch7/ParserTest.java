package ch7;
interface Parseable{
	//구문 분석작업을 수행한다.
	
	public abstract void  parse(String fileName);
		
	}

class ParserManager {
	// 리턴 타입이 Parseable 인터페이스 이다.
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else { 
			Parseable p = new HTMLParser();
			return p;
			//return new HTMLParser;
		}
	}
}


class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		// 구문 분석작업을 수행하는 코드를 적는다
		System.out.println(fileName = " - XML pasing complete..");		
	}
}

	
class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		// 구문 분석작업을 수행하는 코드를 적는다
		System.out.println(fileName = " -HTML parsing complete..");
	}
}

class Parsertest{
	public static void main(String args[]) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
	