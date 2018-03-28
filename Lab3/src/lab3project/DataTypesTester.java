package lab3project;

public class DataTypesTester {
	public static void testByte() {
		byte a = 7, b = 3, c=0;
		
		System.out.println("***** \"byte\" and Arithmetic Operations *****");
		//addition
		c = (byte) (a + b);
		System.out.printf("%d + %d = %d\n", a, b, c);
		//subtraction
		c = (byte) (a - b);
		System.out.printf("%d - %d = %d\n", a, b, c);
		//multiplication
		c = (byte) (a * b);
		System.out.printf("%d * %d = %d\n", a, b, c);
		//division
		c = (byte) (a / b);
		System.out.printf("%d / %d = %d\n", a, b, c);
		//modulus
		c = (byte) (a % b);
		System.out.printf("%d %% %d = %d\n", a, b, c);
		// c = a / 0; --> Arithmetical Exception
		// c = a % 0; --> Arithmetical Exception
		a = 5;
		// unary minus
		c = (byte) -a;
		System. out.printf("-%d = %d\n", a, c);
		// unary plus
		c = (byte) +a;
		System. out.printf("+%d = %d\n", a, c);
		// prefix increment
		a = 5;
		System. out.printf("++%d = %d\n", a, ++a);
		// postfix increment
		a = 5;
		System. out.printf("%d++ = %d\n", a, a++);
		// prefix decrement
		a = 5;
		System. out.printf("--%d = %d\n", a, --a);
		// postfix decrement
		a = 5;
		System. out.printf("%d-- = %d\n", a, a--);
		
		
		System. out.println("\n***** \"byte\" and Relational Operations *****");
		// greater than
		System. out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System. out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System. out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System. out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System. out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System. out.printf("%d != %d --> %b\n", a, b, a != b);
	
		
		System. out.println("\n***** \"byte\" and Logical Operations *****");
		// logical AND
		System. out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
		(a > b) && (a > 0));
		// bitwise logical AND
		System. out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
		(a > b) & (a > 0));
		// logical OR
		System. out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
		(a >= b) || (b != 0));
		// bitwise logical OR
		System. out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
		(a >= b) | (b != 0));
		// logical XOR
		System. out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
		(a >= b) ^ (b != 0));
		// logical NOT
		System. out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		
		System. out.println("\n***** \"byte\" and Bitwise Operations *****");
		c = (byte) (a & b); // bitwise AND
		System. out.printf("%d & %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = (byte) (a | b); // bitwise OR
		System. out.printf("%d | %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = (byte) (a ^ b); // bitwise XOR
		System. out.printf("%d ^ %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = (byte) ~a; // bitwise unary compliment
		System. out.printf("~%d = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("~%s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		c = (byte) (a << 1); // left shift
		System. out.printf("%d << 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		c = (byte) (a >> 1); // right shift
		System. out.printf("%d >> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		a = -5;
		c = (byte) (a >> 1); // right shift
		System. out.printf("%d >> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		a = 5;
		c = (byte) (a >>> 1); // zero fill right shift
		System. out.printf("%d >>> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		a = -5;
		c = (byte) (a >>> 1); // zero fill right shift
		System. out.printf("%d >>> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		System. out.println("\n***** \"byte\" and Assignment Operations *****");
		c = 7;
		System. out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System. out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System. out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System. out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System. out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception
		System. out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System. out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System. out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System. out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System. out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System. out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
				
				
		System. out.println("\n***** \"byte\" and Misc Operations *****");
		System. out.println("\nCondition Operator:");
		System. out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
		(a > b ? a : b));
		System. out.println("\nType Cast Operator:");
		short sh = -32000;
		int in = 2147483647;
		char ch = '\u0002' ;
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		
		c = (byte) sh;
		System. out.printf("byte = short: c = %d --> c = %d\n", sh, c);
		c = (byte) in;
		System.out.printf("byte = int: c = '%d' --> c = %d\n", in, c);
		c = (byte) ch;
		System. out.printf("byte = char: c = '%c' --> c = %d\n", ch, c);
		c = (byte) l;
		System. out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
		c = (byte) f;
		System. out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
		c = (byte) d;
		System. out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
		// c = (byte) bool;
		System. out.printf("byte = boolean: c = (byte)%b --> Compile Error\n",
		bool);
	}
	public static void testShort() {
		short a = 7, b = 3, c=0;
		
		System.out.println("***** \"short\" and Arithmetic Operations *****");
		//addition
		c = (short) (a + b);
		System.out.printf("%d + %d = %d\n", a, b, c);
		//subtraction
		c = (short) (a - b);
		System.out.printf("%d - %d = %d\n", a, b, c);
		//multiplication
		c = (short) (a * b);
		System.out.printf("%d * %d = %d\n", a, b, c);
		//division
		c = (short) (a / b);
		System.out.printf("%d / %d = %d\n", a, b, c);
		//modulus
		c = (short) (a % b);
		System.out.printf("%d %% %d = %d\n", a, b, c);
		// c = a / 0; --> Arithmetical Exception
		// c = a % 0; --> Arithmetical Exception
		a = 5;
		// unary minus
		c = (short) -a;
		System. out.printf("-%d = %d\n", a, c);
		// unary plus
		c = (short) +a;
		System. out.printf("+%d = %d\n", a, c);
		// prefix increment
		a = 5;
		System. out.printf("++%d = %d\n", a, ++a);
		// postfix increment
		a = 5;
		System. out.printf("%d++ = %d\n", a, a++);
		// prefix decrement
		a = 5;
		System. out.printf("--%d = %d\n", a, --a);
		// postfix decrement
		a = 5;
		System. out.printf("%d-- = %d\n", a, a--);
		
		
		System. out.println("\n***** \"short\" and Relational Operations *****");
		// greater than
		System. out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System. out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System. out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System. out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System. out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System. out.printf("%d != %d --> %b\n", a, b, a != b);
	
		
		System. out.println("\n***** \"short\" and Logical Operations *****");
		// logical AND
		System. out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
		(a > b) && (a > 0));
		// bitwise logical AND
		System. out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
		(a > b) & (a > 0));
		// logical OR
		System. out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
		(a >= b) || (b != 0));
		// bitwise logical OR
		System. out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
		(a >= b) | (b != 0));
		// logical XOR
		System. out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
		(a >= b) ^ (b != 0));
		// logical NOT
		System. out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		
		System. out.println("\n***** \"short\" and Bitwise Operations *****");
		c = (short) (a & b); // bitwise AND
		System. out.printf("%d & %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = (short) (a | b); // bitwise OR
		System. out.printf("%d | %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = (short) (a ^ b); // bitwise XOR
		System. out.printf("%d ^ %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = (short) ~a; // bitwise unary compliment
		System. out.printf("~%d = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("~%s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		c = (short) (a << 1); // left shift
		System. out.printf("%d << 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		c = (short) (a >> 1); // right shift
		System. out.printf("%d >> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		a = -5;
		c = (short) (a >> 1); // right shift
		System. out.printf("%d >> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		a = 5;
		c = (short) (a >>> 1); // zero fill right shift
		System. out.printf("%d >>> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		a = -5;
		c = (short) (a >>> 1); // zero fill right shift
		System. out.printf("%d >>> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		System. out.println("\n***** \"short\" and Assignment Operations *****");
		c = 7;
		System. out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System. out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System. out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System. out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System. out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception
		System. out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System. out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System. out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System. out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System. out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System. out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
				
				
		System. out.println("\n***** \"short\" and Misc Operations *****");
		System. out.println("\nCondition Operator:");
		System. out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
		(a > b ? a : b));
		System. out.println("\nType Cast Operator:");
		byte bt = 17;		
		int in = 2147483647;
		char ch = '\u0002' ;
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		
		c = (short) bt;
		System. out.printf("short = byte: c = %d --> c = %d\n", bt, c);
		c = (short) in;
		System.out.printf("short = int: c = '%d' --> c = %d\n", in, c);
		c = (short) ch;
		System. out.printf("short = char: c = '%c' --> c = %d\n", ch, c);
		c = (short) l;
		System. out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
		c = (short) f;
		System. out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
		c = (short) d;
		System. out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
		// c = (short) bool;
		System. out.printf("short = boolean: c = (short)%b --> Compile Error\n",
		bool);
	}
	public static void testInt() {
		int a = 7, b = 3, c;
		
		System.out.println("***** \"int\" and Arithmetic Operations *****");
		//addition
		c = a + b;
		System.out.printf("%d + %d = %d\n", a, b, c);
		//subtraction
		c = a - b;
		System.out.printf("%d - %d = %d\n", a, b, c);
		//multiplication
		c = a * b;
		System.out.printf("%d * %d = %d\n", a, b, c);
		//division
		c = a / b;
		System.out.printf("%d / %d = %d\n", a, b, c);
		//modulus
		c = a % b;
		System.out.printf("%d %% %d = %d\n", a, b, c);
		// c = a / 0; --> Arithmetical Exception
		// c = a % 0; --> Arithmetical Exception
		a = 5;
		// unary minus
		c = -a;
		System. out.printf("-%d = %d\n", a, c);
		// unary plus
		c = +a;
		System. out.printf("+%d = %d\n", a, c);
		// prefix increment
		a = 5;
		System. out.printf("++%d = %d\n", a, ++a);
		// postfix increment
		a = 5;
		System. out.printf("%d++ = %d\n", a, a++);
		// prefix decrement
		a = 5;
		System. out.printf("--%d = %d\n", a, --a);
		// postfix decrement
		a = 5;
		System. out.printf("%d-- = %d\n", a, a--);
		
		
		System. out.println("\n***** \"int\" and Relational Operations *****");
		// greater than
		System. out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System. out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System. out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System. out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System. out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System. out.printf("%d != %d --> %b\n", a, b, a != b);
	
		
		System. out.println("\n***** \"int\" and Logical Operations *****");
		// logical AND
		System. out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
		(a > b) && (a > 0));
		// bitwise logical AND
		System. out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
		(a > b) & (a > 0));
		// logical OR
		System. out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
		(a >= b) || (b != 0));
		// bitwise logical OR
		System. out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
		(a >= b) | (b != 0));
		// logical XOR
		System. out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
		(a >= b) ^ (b != 0));
		// logical NOT
		System. out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		
		System. out.println("\n***** \"int\" and Bitwise Operations *****");
		
		c = a & b; // bitwise AND
		System. out.printf("%d & %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = a | b; // bitwise OR
		System. out.printf("%d | %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = a ^ b; // bitwise XOR
		System. out.printf("%d ^ %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));
		c = ~a; // bitwise unary compliment
		System. out.printf("~%d = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("~%s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		c = a << 1; // left shift
		System. out.printf("%d << 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		c = a >> 1; // right shift
		System. out.printf("%d >> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		a = -5;
		c = a >> 1; // right shift
		System. out.printf("%d >> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		a = 5;
		c = a >>> 1; // zero fill right shift
		System. out.printf("%d >>> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
		a = -5;
		c = a >>> 1; // zero fill right shift
		System. out.printf("%d >>> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
				Integer.toBinaryString(c));
		
		System. out.println("\n***** \"int\" and Assignment Operations *****");
		c = 7;
		System. out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System. out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System. out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System. out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System. out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception
		System. out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System. out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System. out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System. out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System. out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System. out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
				
				
		System. out.println("\n***** \"int\" and Misc Operations *****");
		System. out.println("\nCondition Operator:");
		System. out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
		(a > b ? a : b));
		System. out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002' ;
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		c = bt;
		System. out.printf("int = byte: c = %d --> c = %d\n", bt, c);
		c = sh;
		System. out.printf("int = short: c = %d --> c = %d\n", sh, c);
		c = ch;
		System. out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
		c = (int) l;
		System. out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
		c = (int) f;
		System. out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
		c = (int) d;
		System. out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
		// c = (int) bool;
		System. out.printf("int = boolean: c = (int)%b --> Compile Error\n",
		bool);
		
	}
	public static void testLong() {
		long a = 755000000L, b = 300000000L, c;
		
		System.out.println("***** \"long\" and Arithmetic Operations *****");
		//addition
		c = a + b;
		System.out.printf("%d + %d = %d\n", a, b, c);
		//subtraction
		c = a - b;
		System.out.printf("%d - %d = %d\n", a, b, c);
		//multiplication
		c = a * b;
		System.out.printf("%d * %d = %d\n", a, b, c);
		//division
		c = a / b;
		System.out.printf("%d / %d = %d\n", a, b, c);
		//modulus
		c = a % b;
		System.out.printf("%d %% %d = %d\n", a, b, c);
		// c = a / 0; --> Arithmetical Exception
		// c = a % 0; --> Arithmetical Exception
		a = 5;
		// unary minus
		c = -a;
		System. out.printf("-%d = %d\n", a, c);
		// unary plus
		c = +a;
		System. out.printf("+%d = %d\n", a, c);
		// prefix increment
		a = 5;
		System. out.printf("++%d = %d\n", a, ++a);
		// postfix increment
		a = 5;
		System. out.printf("%d++ = %d\n", a, a++);
		// prefix decrement
		a = 5;
		System. out.printf("--%d = %d\n", a, --a);
		// postfix decrement
		a = 5;
		System. out.printf("%d-- = %d\n", a, a--);
		
		
		System. out.println("\n***** \"long\" and Relational Operations *****");
		// greater than
		System. out.printf("%d > %d --> %b\n", a, b, a > b);
		// greater than or equal to
		System. out.printf("%d >= %d --> %b\n", a, b, a >= b);
		// less than
		System. out.printf("%d < %d --> %b\n", a, b, a < b);
		// less than or equal to
		System. out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to
		System. out.printf("%d == %d --> %b\n", a, b, a == b);
		// not equal to
		System. out.printf("%d != %d --> %b\n", a, b, a != b);
	
		
		System. out.println("\n***** \"long\" and Logical Operations *****");
		// logical AND
		System. out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
		(a > b) && (a > 0));
		// bitwise logical AND
		System. out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
		(a > b) & (a > 0));
		// logical OR
		System. out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
		(a >= b) || (b != 0));
		// bitwise logical OR
		System. out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
		(a >= b) | (b != 0));
		// logical XOR
		System. out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,
		(a >= b) ^ (b != 0));
		// logical NOT
		System. out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
		
		
		System. out.println("\n***** \"long\" and Bitwise Operations *****");
		
		c = a & b; // bitwise AND
		System. out.printf("%d & %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s & %s = %s\n", Long.toBinaryString(a),
				Long.toBinaryString(b), Long.toBinaryString(c));
		c = a | b; // bitwise OR
		System. out.printf("%d | %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s | %s = %s\n", Long.toBinaryString(a),
				Long.toBinaryString(b), Long.toBinaryString(c));
		c = a ^ b; // bitwise XOR
		System. out.printf("%d ^ %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
				Long.toBinaryString(b), Long.toBinaryString(c));
		c = ~a; // bitwise unary compliment
		System. out.printf("~%d = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("~%s = %s\n", Long.toBinaryString(a),
				Long.toBinaryString(c));
		c = a << 1; // left shift
		System. out.printf("%d << 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s << 1 = %s\n", Long.toBinaryString(a),
				Long.toBinaryString(c));
		c = a >> 1; // right shift
		System. out.printf("%d >> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
				Long.toBinaryString(c));
		a = -5;
		c = a >> 1; // right shift
		System. out.printf("%d >> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
				Long.toBinaryString(c));
		a = 5;
		c = a >>> 1; // zero fill right shift
		System. out.printf("%d >>> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
				Long.toBinaryString(c));
		a = -5;
		c = a >>> 1; // zero fill right shift
		System. out.printf("%d >>> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
				Long.toBinaryString(c));
		
		System. out.println("\n***** \"long\" and Assignment Operations *****");
		c = 7;
		System. out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System. out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System. out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System. out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System. out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception
		System. out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System. out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System. out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System. out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System. out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System. out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
				
				
		System. out.println("\n***** \"long\" and Misc Operations *****");
		System. out.println("\nCondition Operator:");
		System. out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
		(a > b ? a : b));
		System. out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		int in = 35000;
		char ch = '\u0002' ;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		c = (long) bt;
		System. out.printf("long = byte: c = %d --> c = %d\n", bt, c);
		c = (long) sh;
		System. out.printf("long = short: c = %d --> c = %d\n", sh, c);
		c = (long) in;
		System. out.printf("long = int: c = (long)%d --> c = %d\n", in, c);
		c = (long) ch;
		System. out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
		c = (long) f;
		System. out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
		c = (long) d;
		System. out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
		// c = (long) bool;
		System. out.printf("long = boolean: c = (long)%b --> Compile Error\n",
		bool);
	}
	public static void testFloat() {
		float a = 7.7f, b = 3.4f, c;

		System.out.println("***** \"float\" and Arithmetic Operations *****");
		// addition
		c = a + b;
		System.out.printf("%f + %f = %f\n", a, b, c);
		// subtraction
		c = a - b;
		System.out.printf("%f - %f = %f\n", a, b, c);
		// multiplication
		c = a * b;
		System.out.printf("%f * %f = %f\n", a, b, c);
		// division
		c = a / b;
		System.out.printf("%f / %f = %f\n", a, b, c);
		// modulus
		c = a % b;
		System.out.printf("%f %% %f = %f\n", a, b, c);
		// c = a / 0; --> Arithmetical Exception
		// c = a % 0; --> Arithmetical Exception
		a = 7.7f;
		// unary minus
		c = -a;
		System.out.printf("-%f = %f\n", a, c);
		// unary plus
		c = +a;
		System.out.printf("+%f = %f\n", a, c);
		// prefix increment
		a = 7.7f;
		System.out.printf("++%f = %f\n", a, ++a);
		// postfix increment
		a = 7.7f;
		System.out.printf("%f++ = %f\n", a, a++);
		// prefix decrement
		a = 7.7f;
		System.out.printf("--%f = %f\n", a, --a);
		// postfix decrement
		a = 7.7f;
		System.out.printf("%f-- = %f\n", a, a--);

		System.out.println("\n***** \"float\" and Relational Operations *****");
		// greater than
		System.out.printf("%f > %f --> %b\n", a, b, a > b);
		// greater than or equal to
		System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
		// less than
		System.out.printf("%f < %f --> %b\n", a, b, a < b);
		// less than or equal to
		System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
		// equal to
		System.out.printf("%f == %f --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%f != %f --> %b\n", a, b, a != b);

		System.out.println("\n***** \"float\" and Logical Operations *****");
		// logical AND
		System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
		// bitwise logical AND
		System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
		// logical OR
		System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		// bitwise logical OR
		System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
		// logical XOR
		System.out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
		// logical NOT
		System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

		System.out.println("\n***** \"float\" and Bitwise Operations *****");

		System.out.println("\n***** \"float\" and Assignment Operations *****");
		c = 7;
		System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
		System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
		System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
		System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
		System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception
		// System. out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		// System. out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		// System. out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		// System. out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		// System. out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		// System. out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

		System.out.println("\n***** \"float\" and Misc Operations *****");
		System.out.println("\nCondition Operator:");
		System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
		System.out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		int in = 275488;
		long l = 100000000000000000L;
		double d = 123456789.625;
		boolean bool = true;
		c = bt;
		System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
		c = sh;
		System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
		c = ch;
		System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
		c = in;
		System.out.printf("float = int: c = '%c' --> c = %f\n", in, c);
		c = l;
		System.out.printf("float = long: c = (float)%d --> c = %f\n", l, c);
		c = (float) d;
		System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
		// c = (int) bool;
		System.out.printf("float = boolean: c = (float)%b --> Compile Error\n", bool);
	}
	public static void testDouble() {
		double a = 7.754, b = 3.445, c;
		
		System.out.println("***** \"double\" and Arithmetic Operations *****");
		//addition
		c = a + b;
		System.out.printf("%f + %f = %f\n", a, b, c);
		//subtraction
		c = a - b;
		System.out.printf("%f - %f = %f\n", a, b, c);
		//multiplication
		c = a * b;
		System.out.printf("%f * %f = %f\n", a, b, c);
		//division
		c = a / b;
		System.out.printf("%f / %f = %f\n", a, b, c);
		//modulus
		c = a % b;
		System.out.printf("%f %% %f = %f\n", a, b, c);
		// c = a / 0; --> Arithmetical Exception
		// c = a % 0; --> Arithmetical Exception
		a = 7.7f;
		// unary minus
		c = -a;
		System. out.printf("-%f = %f\n", a, c);
		// unary plus
		c = +a;
		System. out.printf("+%f = %f\n", a, c);
		// prefix increment
		a = 7.7f;
		System. out.printf("++%f = %f\n", a, ++a);
		// postfix increment
		a = 7.7f;
		System. out.printf("%f++ = %f\n", a, a++);
		// prefix decrement
		a = 7.7f;
		System. out.printf("--%f = %f\n", a, --a);
		// postfix decrement
		a = 7.7f;
		System. out.printf("%f-- = %f\n", a, a--);
		
		
		System. out.println("\n***** \"double\" and Relational Operations *****");
		// greater than
		System. out.printf("%f > %f --> %b\n", a, b, a > b);
		// greater than or equal to
		System. out.printf("%f >= %f --> %b\n", a, b, a >= b);
		// less than
		System. out.printf("%f < %f --> %b\n", a, b, a < b);
		// less than or equal to
		System. out.printf("%f <= %f --> %b\n", a, b, a <= b);
		// equal to
		System. out.printf("%f == %f --> %b\n", a, b, a == b);
		// not equal to
		System. out.printf("%f != %f --> %b\n", a, b, a != b);
	
		
		System. out.println("\n***** \"double\" and Logical Operations *****");
		// logical AND
		System. out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
		(a > b) && (a > 0));
		// bitwise logical AND
		System. out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
		(a > b) & (a > 0));
		// logical OR
		System. out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
		(a >= b) || (b != 0));
		// bitwise logical OR
		System. out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
		(a >= b) | (b != 0));
		// logical XOR
		System. out.printf("(%f >= %f) ^ (%f != 0) --> %b\n", a, b, b,
		(a >= b) ^ (b != 0));
		// logical NOT
		System. out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
		
		
		System. out.println("\n***** \"double\" and Bitwise Operations *****");
		
		
		System. out.println("\n***** \"double\" and Assignment Operations *****");
		c = 7;
		System. out.printf("%f += %f --> c = %f\n", c, a, c += a);
		System. out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
		System. out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
		System. out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
		System. out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception
		//System. out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		//System. out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		//System. out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		//System. out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		//System. out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		//System. out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
				
				
		System. out.println("\n***** \"double\" and Misc Operations *****");
		System. out.println("\nCondition Operator:");
		System. out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,
		(a > b ? a : b));
		System. out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		char ch = '\u0002';
		int in = 275488;
		long l = 100000000000000000L;
		float f = 1.9f;
		boolean bool = true;
		c = bt;
		System. out.printf("double = byte: c = %d --> c = %f\n", bt, c);
		c = sh;
		System. out.printf("double = short: c = %d --> c = %f\n", sh, c);
		c = ch;
		System. out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
		c= in;
		System. out.printf("double = int: c = '%c' --> c = %f\n", in, c);
		c = l;
		System. out.printf("double = long: c = (double)%d --> c = %f\n", l, c);
		c = f;
		System. out.printf("double = double: c = (double)%f --> c = %f\n", f, c);
		// c = (int) bool;
		System. out.printf("double = boolean: c = (double)%b --> Compile Error\n",
		bool);
	}
	public static void testChar() {
		//char a = '\u03D3', b = '\uFFFF', c;
		char a = 'K', b = 'S', c;
		
		System.out.println("***** \"char\" and Arithmetic Operations *****");
		/*// addition
		c = (char) (a + b);
		System.out.printf("%c + %c = %s\n", a, b, c);
		// subtraction
		c = (char) (a - b);
		System.out.printf("%d - %d = %d\n", a, b, c);
		// multiplication
		c = (char) (a * b);
		System.out.printf("%d * %d = %d\n", a, b, c);
		// division
		c = (char) (a / b);
		System.out.printf("%d / %d = %d\n", a, b, c);
		// modulus
		c = (char) (a % b);
		System.out.printf("%d %% %d = %d\n", a, b, c);
		// c = a / 0; --> Arithmetical Exception
		// c = a % 0; --> Arithmetical Exception
		a = 'A';
		// unary minus
		c = (char) (-a);
		System.out.printf("-%d = %d\n", a, c);
		// unary plus
		c = (char) (+a);
		System.out.printf("+%d = %d\n", a, c);
		// prefix increment
		a = 'A';
		System.out.printf("++%d = %d\n", a, ++a);
		// postfix increment
		a = 'A';
		System.out.printf("%d++ = %d\n", a, a++);
		// prefix decrement
		a = 'B';
		System.out.printf("--%d = %d\n", a, --a);
		// postfix decrement
		a = 'B';
		System.out.printf("%d-- = %d\n", a, a--);
*/
		
		System. out.println("\n***** \"char\" and Relational Operations *****");
		// greater than
		System. out.printf("%c > %c --> %b\n", a, b, a > b);
		// greater than or equal to
		System. out.printf("%c >= %c --> %b\n", a, b, a >= b);
		// less than
		System. out.printf("%c < %c --> %b\n", a, b, a < b);
		// less than or equal to
		System. out.printf("%c <= %c --> %b\n", a, b, a <= b);
		// equal to
		System. out.printf("%c == %c --> %b\n", a, b, a == b);
		// not equal to
		System. out.printf("%c != %c --> %b\n", a, b, a != b);
	
		
		System. out.println("\n***** \"char\" and Logical Operations *****");
		// logical AND
		System. out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a,
		(a > b) && (a > 0));
		// bitwise logical AND
		System. out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a,
		(a > b) & (a > 0));
		// logical OR
		System. out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b,
		(a >= b) || (b != 0));
		// bitwise logical OR
		System. out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b,
		(a >= b) | (b != 0));
		// logical XOR
		System. out.printf("(%c >= %c) ^ (%c != 0) --> %b\n", a, b, b,
		(a >= b) ^ (b != 0));
		// logical NOT
		System. out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));
		
		
		System. out.println("\n***** \"char\" and Bitwise Operations *****");
		
		
		System. out.println("\n***** \"char\" and Assignment Operations *****");
		c = 7;
		System. out.printf("%c += %c --> c = %c\n", c, a, c += a);
		System. out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
		System. out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
		System. out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
		System. out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);
		// c %= 0; --> Arithmetical Exception
		// c /= 0; --> Arithmetical Exception
		System. out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
		System. out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
		System. out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
		System. out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1);
		System. out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1);
		System. out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1);
				
				
		System. out.println("\n***** \"char\" and Misc Operations *****");
		System. out.println("\nCondition Operator:");
		System. out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b,
		(a > b ? a : b));
		System. out.println("\nType Cast Operator:");
		byte bt = 1;
		short sh = -32000;
		int in = 12654745;
		long l = 100000000000000000L;
		float f = 1.9f;
		double d = 123456789.625;
		boolean bool = true;
		c = (char) bt;
		System. out.printf("char = byte: c = %c --> c = %c\n", bt, c);
		c = (char) sh;
		System. out.printf("char = short: c = %c --> c = %s\n", sh, c);
		c = (char) in;
		System. out.printf("char = int: c = '%c' --> c = %c\n", in, c);
		c = (char) l;
		System. out.printf("char = long: c = (char)%d --> c = %c\n", l, c);
		c = (char) f;
		System. out.printf("char = float: c = (char)%f --> c = %c\n", f, c);
		c = (char) d;
		System. out.printf("char = double: c = (char)%f --> c = %c\n", d, c);
		// c = (char) bool;
		System. out.printf("char = boolean: c = (char)%b --> Compile Error\n",
		bool);	
	}
	public static void testBoolean() {
		boolean a = true, b = false, c;
		System.out.println("\n***** Arithmetical Operations *****");
		// c = a + b; // addition
		// c = a - b; // subtraction
		// c = a * b; // multiplication
		// c = a / b; // division
		// c = a % b; // modulus
		// c = -a; // unary minus
		// c = +a; // unary plus
		// c = ++a; // prefix increment
		// c = a++; // postfix increment
		// c = --a; // prefix decrement
		// c = a--; // postfix decrement
		System.out.println("\n***** Bitwise Operations *****");
		c = a & b; // bitwise AND
		System.out.printf("%b & %b = %b\n", a, b, c);
		c = a | b; // bitwise OR
		System.out.printf("%b | %b = %b\n", a, b, c);
		c = a ^ b; // bitwise XOR
		System.out.printf("%b ^ %b = %b\n", a, b, c);
		// c = ~a; // bitwise unary compliment
		// c = a << 1; // left shift
		// c = a >> 1; //right shift
		// c = a >>> 1; // zero fill right shift
		System.out.println("\n***** Assignment Operations *****");
		System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
		System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
		System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
		// c += a;
		// c -= a;
		// c *= a;
		// c /= a;
		// c %= a;
		// c >>= 1;
		// c <<= 1;
		// c >>>= 1;
		System.out.println("\n***** Relational Operations *****");
		// equal to
		System.out.printf("%b == %b --> %b\n", a, b, a == b);
		// not equal to
		System.out.printf("%b != %b --> %b\n", a, b, a != b);
		// c = a > b; // greater than
		// c = a >= b; // greater than or equal to
		// c = a < b; // less than
		// c = a <= b; // less than or equal to
		System.out.println("\n***** Logical Operations *****");
		c = a && b; // logical AND
		System.out.printf("%b && %b = %b\n", a, b, c);
		c = a || b; // logical OR
		System.out.printf("%b || %b = %b\n", a, b, c);
		c = a ^ b; // logical XOR
		System.out.printf("%b ^ %b = %b\n", a, b, c);
		// logical NOT
		System.out.printf("!%b --> %b\n", a, !a);
		System.out.println("\n***** Misc Operations *****");
		System.out.println("\nCondition Operator:");
		System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
		System.out.println("\nType Cast Operator:");
		// byte bt = 1;
		// short sh = -32000;
		// char ch = '\u0002';
		// long l = 100000000000000000L;
		// float f = 1.9f;
		// double d = 123456789.625;
		boolean bool = true;
		// c = (boolean) bt;
		// c = (boolean) sh;
		// c = (boolean) ch;
		// c = (boolean) l;
		// c = (boolean) f;
		// c = (boolean) d;
		c = bool;
		System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
	}
	public static void testStudent() {
		
	}
	public static void testString() {}
	
}
