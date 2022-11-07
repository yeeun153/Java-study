package project;

import java.util.*;

public class MemberMgr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> member = new ArrayList<Member>();
		System.out.print("등록할 인원수 >>");
		int num = sc.nextInt();
		
		Member[] m = new Member[num];
		
		for(int i=0; i<m.length; i++) {
			System.out.print("이름과 전화번호 입력 : ");
			String name = sc.next();
			String tel = sc.next();
			m[i] = new Member(name, tel);
			member.add(new Member(name, tel));
		}
		System.out.println("저장되었습니다.");
		
		while(true) {
			System.out.print("\n목록보기[1], 검색[2], 삭제[3], 수정[4], 종료[5]>>");
			int check = sc.nextInt();
			
			if(check == 1) {
				for(int i=0; i<member.size(); i++) {
					System.out.println("["+ (i+1) + "]" + member.get(i).toString());
				}
				continue;
			}
			
			
			else if (check == 2) {
				int sel = 0;
				while(sel!=7) {
					System.out.print("계속 검색[6], 검색 종료[7]>>");
					int sel1 = sc.nextInt();
					if (sel1 == 6) {
						System.out.print("검색할 이름을 입력하세요.");
						String name = sc.next();
						int count = 0;
						for(int i=0; i<member.size(); i++) {
							if(name.equals(m[i].getName())) {
								System.out.print(name + "의 번호는 " + m[i].getTel() + "입니다.\n\n");
								count++;
							}
						}
						if (count == 0) {
							System.out.println("검색한 이름이 없습니다.\n");
						}
						
					}
					else if(sel1 == 7)
						break;
				
				}
				continue;
			}
			
			
			else if (check == 3) {
				System.out.println();
				for(int i=0; i<member.size(); i++) {
					System.out.println("["+ (i+1) + "]" + m[i].getName() + " " + m[i].getTel());
				}
				System.out.print("번호를 선택하면 삭제됩니다.>>");
				int sel2 = sc.nextInt();
				member.remove(sel2-1);
				System.out.println();
				
				for(int i=0; i<member.size(); i++) {
					System.out.println("["+ (i+1) + "]" + member.get(i).toString());
				}
				
				continue;
			}
			
			
			else if (check == 4) {
				System.out.println();
				for(int i=0; i<member.size(); i++) {
					System.out.println("["+ (i+1) + "]" + member.get(i).toString());
				}
				System.out.print("수정할 번호를 선택하세요.>>");
				int sel3 = sc.nextInt();
				System.out.print("이름과 전화번호 입력 >>");
				String name = sc.next();
				String tel = sc.next();

				member.remove(sel3-1);
				member.add(sel3-1, new Member(name, tel));
				
				System.out.println();
				for(int i=0; i<member.size(); i++) {
					System.out.println("["+ (i+1) + "]" + member.get(i).toString());
				}
				
				continue;
			}
				
			
			else if (check == 5) 
				System.out.println("\n프로그램을 종료합니다.");
				break;
		}
		
	}

	

	
}



