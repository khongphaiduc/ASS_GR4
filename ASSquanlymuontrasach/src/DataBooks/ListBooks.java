
package DataBooks;
import  java.util.HashMap;

public class ListBooks {
    
    HashMap<String, Object> t = new HashMap<>();

    public ListBooks() {
        Love_1 book36 = new Love_1("Câu chuyện tình yêu đầy cảm xúc và sự hy sinh.", "Sách L", "Tác giả A", "NXB A", 2023, 200, "Một câu chuyện tình yêu đáng đọc", 25);
        Love_1 book37 = new Love_1("Tình yêu giữa hai người từ hai thế giới khác nhau.", "Sách B", "Tác giả B", "NXB B", 2021, 180, "Một câu chuyện tình yêu thú vị", 22);
        Love_1 book38 = new Love_1("Một cuộc tình ngọt ngào bắt đầu từ một lời hứa.", "Sách C", "Tác giả C", "NXB C", 2019, 250, "Một câu chuyện tình yêu ngọt ngào", 28);
        Love_1 book39 = new Love_1("Tình yêu đích thực luôn luôn tìm đường trở về.", "Sách D", "Tác giả D", "NXB D", 2017, 220, "Một câu chuyện tình yêu đích thực", 30);
        Love_1 book40 = new Love_1("Nụ hôn đầu tiên trong ngày nắng.", "Sách E", "Tác giả E", "NXB E", 2015, 270, "Một câu chuyện tình yêu lãng mạn", 26);
        Love_1 book41 = new Love_1("Cảm giác yêu thương khi người kia cười.", "Sách F", "Tác giả F", "NXB F", 2013, 230, "Một câu chuyện tình yêu cảm động", 24);
        Love_1 book42 = new Love_1("Một mối tình qua thư từ ngọt ngào.", "Sách G", "Tác giả G", "NXB G", 2011, 300, "Một câu chuyện tình yêu qua thư từ", 32);
        Love_1 book43 = new Love_1("Hai trái tim hòa quyện trong một bữa tiệc đầy lãng mạn.", "Sách H", "Tác giả H", "NXB H", 2010, 280, "Một câu chuyện tình yêu lãng mạn", 29);
        Love_1 book44 = new Love_1("Bước chân ngại ngùng trên con đường tình yêu.", "Sách I", "Tác giả I", "NXB I", 2018, 260, "Một câu chuyện tình yêu thú vị", 27);
        Love_1 book45 = new Love_1("Tình yêu thời chiến đấu vì hòa bình.", "Sách J", "Tác giả J", "NXB J", 2016, 240, "Một câu chuyện tình yêu lịch sử", 25);
        Love_1 book46 = new Love_1("Những lời thổ lộ trong ánh đèn đường.", "Sách K", "Tác giả K", "NXB K", 2014, 210, "Một câu chuyện tình yêu nhẹ nhàng", 23);
        Love_1 book47 = new Love_1("Suy nghĩ về người yêu dấu khi rơi nước mắt.", "Sách L", "Tác giả L", "NXB L", 2012, 290, "Một câu chuyện tình yêu cảm động", 28);
        Love_1 book48 = new Love_1("Chạm vào trái tim qua một bài thơ.", "Sách M", "Tác giả M", "NXB M", 2011, 270, "Một câu chuyện tình yêu lãng mạn", 26);
        Love_1 book49 = new Love_1("Những đôi mắt nhìn nhau giữa biển người.", "Sách N", "Tác giả N", "NXB N", 2019, 310, "Một câu chuyện tình yêu cảm động", 30);
        Love_1 book50 = new Love_1("Bàn tay nắm chặt nhau không rời.", "Sách O", "Tác giả O", "NXB O", 2020, 320, "Một câu chuyện tình yêu chân thành", 32);

        horrified_2 book1 = new horrified_2("Không gian sợ hãi", "Tâm lý đáng sợ", "Sách Kinh dị A", "Tác giả A", "NXB X", 2023, 250, "Mô tả sự kinh dị và tâm lý của con người", 28);
        horrified_2 book2 = new horrified_2("Ám ảnh của quá khứ", "Sự phân tâm của tâm trí", "Sách Kinh dị B", "Tác giả B", "NXB Y", 2021, 220, "Câu chuyện kinh dị và tâm lý đáng sợ", 26);
        horrified_2 book3 = new horrified_2("Cảm giác sợ hãi mỗi đêm", "Nỗi sợ hãi bất chợt", "Sách Kinh dị C", "Tác giả C", "NXB Z", 2019, 280, "Câu chuyện ám ảnh và tâm lý", 30);
        horrified_2 book4 = new horrified_2("Kinh dị từ sâu thẳm của tâm trí", "Mối liên kết tâm lý kinh hoàng", "Sách Kinh dị D", "Tác giả D", "NXB XYZ", 2017, 300, "Mô tả kinh dị và tâm lý của con người", 32);
        horrified_2 book5 = new horrified_2("Nỗi sợ hãi của một đời", "Ám ảnh từ những nỗi sợ hãi", "Sách Kinh dị E", "Tác giả E", "NXB Q", 2015, 260, "Câu chuyện kinh dị và tâm lý phức tạp", 29);
        horrified_2 book6 = new horrified_2("Mất ngủ vì ám ảnh từ kinh dị", "Sự sợ hãi không lối thoát", "Sách Kinh dị F", "Tác giả F", "NXB W", 2013, 240, "Mô tả cảm giác kinh dị và sự ám ảnh", 27);
        horrified_2 book7 = new horrified_2("Kinh dị từ những sự kiện thật sự", "Tâm lý sợ hãi chân thật", "Sách Kinh dị G", "Tác giả G", "NXB E", 2011, 280, "Một cuộc hành trình qua sự kinh dị và tâm lý", 31);
        horrified_2 book8 = new horrified_2("Ám ảnh từ sự sống và cái chết", "Mối đe dọa tâm lý", "Sách Kinh dị H", "Tác giả H", "NXB R", 2019, 270, "Câu chuyện về sự sống và cái chết", 28);
        horrified_2 book9 = new horrified_2("Cảm giác sợ hãi từ những người lạ", "Ám ảnh từ nỗi sợ hãi", "Sách Kinh dị I", "Tác giả I", "NXB T", 2018, 290, "Mô tả cảm giác sợ hãi và sự ám ảnh", 30);
        horrified_2 book10 = new horrified_2("Sự kinh dị của tâm trí con người", "Nỗi sợ hãi của những nỗi ám ảnh", "Sách Kinh dị J", "Tác giả J", "NXB U", 2016, 310, "Câu chuyện kinh dị và tâm lý phức tạp", 32);
        horrified_2 book11 = new horrified_2("Tâm lý sợ hãi từ những kinh dị", "Ám ảnh từ những nỗi sợ hãi", "Sách Kinh dị K", "Tác giả K", "NXB I", 2014, 280, "Mô tả cảm giác sợ hãi và sự ám ảnh", 30);
        horrified_2 book12 = new horrified_2("Ám ảnh từ những ký ức kinh dị", "Sự kinh hoàng của tâm trí", "Sách Kinh dị L", "Tác giả L", "NXB O", 2012, 300, "Mô tả cảm giác kinh dị và tâm lý", 31);
        horrified_2 book13 = new horrified_2("Những cảm giác sợ hãi và ám ảnh", "Ám ảnh từ sự kinh dị", "Sách Kinh dị M", "Tác giả M", "NXB P", 2010, 270, "Mô tả cảm giác sợ hãi và sự ám ảnh", 28);
        horrified_2 book14 = new horrified_2("Sự kinh dị từ nỗi ám ảnh", "Nỗi sợ hãi của tâm lý", "Sách Kinh dị N", "Tác giả N", "NXB Q", 2011, 280, "Câu chuyện về sự hồi tưởng kinh dị và tâm lý", 29);
        horrified_2 book15 = new horrified_2("Mối liên kết tâm lý và kinh dị", "Nỗi sợ hãi từ sự ám ảnh", "Sách Kinh dị O", "Tác giả O", "NXB R", 2013, 310, "Mô tả cảm giác sợ hãi và sự ám ảnh từ kinh dị", 30);

        Education_3 book21 = new Education_3("Hướng dẫn tự học lập trình Java", "Sách giáo dục A", "Tác giả A", "NXB A", 2023, 250, "Cuốn sách này cung cấp hướng dẫn tự học lập trình Java", 28);
        Education_3 book22 = new Education_3("Giới thiệu về trí tuệ nhân tạo", "Sách giáo dục B", "Tác giả B", "NXB B", 2021, 220, "Cuốn sách này giới thiệu về lĩnh vực trí tuệ nhân tạo", 26);
        Education_3 book23 = new Education_3("Cơ bản về khoa học dữ liệu", "Sách giáo dục C", "Tác giả C", "NXB C", 2019, 280, "Cuốn sách này cung cấp kiến thức cơ bản về khoa học dữ liệu", 30);
        Education_3 book24 = new Education_3("Lập trình Python cho người mới bắt đầu", "Sách giáo dục D", "Tác giả D", "NXB D", 2017, 300, "Cuốn sách này giúp bạn học lập trình Python từ đầu", 32);
        Education_3 book25 = new Education_3("Học máy và ứng dụng", "Sách giáo dục E", "Tác giả E", "NXB E", 2015, 260, "Cuốn sách này giới thiệu về học máy và các ứng dụng của nó", 29);
        Education_3 book26 = new Education_3("Toán học trong lập trình máy tính", "Sách giáo dục F", "Tác giả F", "NXB F", 2013, 240, "Cuốn sách này giải thích các khái niệm toán học cần thiết trong lập trình", 27);
        Education_3 book27 = new Education_3("An ninh mạng và bảo mật thông tin", "Sách giáo dục G", "Tác giả G", "NXB G", 2011, 280, "Cuốn sách này cung cấp kiến thức về an ninh mạng và bảo mật thông tin", 31);
        Education_3 book28 = new Education_3("Phát triển ứng dụng di động với Android", "Sách giáo dục H", "Tác giả H", "NXB H", 2019, 270, "Cuốn sách này hướng dẫn bạn phát triển ứng dụng di động trên nền tảng Android", 28);
        Education_3 book29 = new Education_3("Kiến trúc máy tính và hệ thống số", "Sách giáo dục I", "Tác giả I", "NXB I", 2018, 290, "Cuốn sách này giới thiệu về kiến trúc máy tính và hệ thống số", 30);
        Education_3 book30 = new Education_3("Phân tích và thiết kế hệ thống", "Sách giáo dục J", "Tác giả J", "NXB J", 2016, 310, "Cuốn sách này cung cấp kiến thức về phân tích và thiết kế hệ thống", 32);
        Education_3 book31 = new Education_3("Lập trình hướng đối tượng với C++", "Sách giáo dục K", "Tác giả K", "NXB K", 2014, 280, "Cuốn sách này giúp bạn học lập trình hướng đối tượng với C++", 30);
        Education_3 book32 = new Education_3("Khoa học dữ liệu nâng cao", "Sách giáo dục L", "Tác giả L", "NXB L", 2012, 300, "Cuốn sách này cung cấp kiến thức nâng cao về khoa học dữ liệu", 31);
        Education_3 book33 = new Education_3("Phát triển web với JavaScript", "Sách giáo dục M", "Tác giả M", "NXB M", 2010, 270, "Cuốn sách này hướng dẫn bạn phát triển web với JavaScript", 28);
        Education_3 book34 = new Education_3("Lập trình di động với iOS", "Sách giáo dục N", "Tác giả N", "NXB N", 2011, 280, "Cuốn sách này giúp bạn phát triển ứng dụng di động trên nền tảng iOS", 29);
        Education_3 book35 = new Education_3("Thiết kế và triển khai hệ thống nhúng", "Sách giáo dục O", "Tác giả O", "NXB O", 2013, 310, "Cuốn sách này cung cấp kiến thức về thiết kế và triển khai hệ thống nhúng", 30);

        t.put("Book36", book36);
        t.put("Book37", book37);
        t.put("Book38", book38);
        t.put("Book39", book39);
        t.put("Book40", book40);
        t.put("Book41", book41);
        t.put("Book42", book42);
        t.put("Book43", book43);
        t.put("Book44", book44);
        t.put("Book45", book45);
        t.put("Book46", book46);
        t.put("Book47", book47);
        t.put("Book48", book48);
        t.put("Book49", book49);
        t.put("Book50", book50);

        t.put("Book1", book1);
        t.put("Book2", book2);
        t.put("Book3", book3);
        t.put("Book4", book4);
        t.put("Book5", book5);
        t.put("Book6", book6);
        t.put("Book7", book7);
        t.put("Book8", book8);
        t.put("Book9", book9);
        t.put("Book10", book10);
        t.put("Book11", book11);
        t.put("Book12", book12);
        t.put("Book13", book13);
        t.put("Book14", book14);
        t.put("Book15", book15);

        t.put("Book21", book21);
        t.put("Book22", book22);
        t.put("Book23", book23);
        t.put("Book24", book24);
        t.put("Book25", book25);
        t.put("Book26", book26);
        t.put("Book27", book27);
        t.put("Book28", book28);
        t.put("Book29", book29);
        t.put("Book30", book30);
        t.put("Book31", book31);
        t.put("Book32", book32);
        t.put("Book33", book33);
        t.put("Book34", book34);
        t.put("Book35", book35);
    }
}
