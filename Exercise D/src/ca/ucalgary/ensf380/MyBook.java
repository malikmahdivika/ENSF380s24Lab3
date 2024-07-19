package ca.ucalgary.ensf380;

public class MyBook {

    public static void main(String[] args) {
        
        // Scenario 1: Author Class
    	
        Author defaultAuthor = new Author();
        System.out.println("Default Author:");
        System.out.println("Name: " + defaultAuthor.getName());
        System.out.println("Address: " + defaultAuthor.getAddress());
        System.out.println("Age: " + defaultAuthor.getAge());

        Author specificAuthor = new Author("Jane Austen", "123 Main St", 45);
        System.out.println("\nParameterized Author:");
        System.out.println("Name: " + specificAuthor.getName());
        System.out.println("Address: " + specificAuthor.getAddress());
        System.out.println("Age: " + specificAuthor.getAge());

        // Test setters
        
        defaultAuthor.setName("George Orwell");
        defaultAuthor.setAddress("456 Elm St");
        defaultAuthor.setAge(46);
        System.out.println("\nUpdated Default Author:");
        System.out.println("Name: " + defaultAuthor.getName());
        System.out.println("Address: " + defaultAuthor.getAddress());
        System.out.println("Age: " + defaultAuthor.getAge());

        // Scenario 2: Anthology Class
        
        Story[] stories = { new Story(), new Story() };
        Anthology anthology = new Anthology();
        anthology.setStory(stories);
        System.out.println("\nAnthology Stories:");
        for (Story story : anthology.getStory()) {
            System.out.println(story.plot());
        }
        System.out.println("Story Order: " + anthology.storyOrder());

        // Scenario 3: Category Class
        
        Category cat1 = new Category();
        Category cat2 = new Category();
        cat1.setSubCategory(cat2);
        cat2.setSuperCategory(cat1);
        cat1.setCategory("Science Fiction");
        System.out.println("\nCategory:");
        System.out.println("Category: " + cat1.getCategory());
        System.out.println("SubCategory: " + cat1.getSubCategory().getCategory());
        System.out.println("SuperCategory: " + cat2.getSuperCategory().getCategory());
        System.out.println("Sort Order: " + cat1.sort());

        // Scenario 4: Classic Class
        
        Classic classic = new Classic();
        classic.setOrigPubYear(1999);
        classic.setTheAuthor(specificAuthor);
        classic.setBookPublisher(new Publisher[2]);
        System.out.println("\nClassic:");
        System.out.println("Original Publication Year: " + classic.getOrigPubYear());
        System.out.println("Author: " + classic.getTheAuthor().getName());
        System.out.println("Notes: " + classic.createNotes());

        // Scenario 5: Contract Class
        
        Publisher publisher = new Publisher("Publisher Co.", "456 Oak St");
        Author[] authors = {defaultAuthor, specificAuthor};
        Contract contract = new Contract("2024-07-18", publisher, authors);
        System.out.println("\nContract:");
        System.out.println("Date: " + contract.getDate());
        System.out.println("Publisher: " + contract.getPublisherInfo().getName());
        System.out.println("Authors: ");
        for (Author auth : contract.getAuthorInfo()) {
            System.out.println(" - " + auth.getName());
        }
        System.out.println("Contract Details: " + contract.printContract());

        // Scenario 6: Fiction Class
        
        Fiction fiction = new Fiction();
        System.out.println("\nFiction:");
        System.out.println("Cover Art: " + fiction.coverArt());
        System.out.println("Genre: " + fiction.genre());

        // Scenario 8: NonFiction Class
        
        Nonfiction nonfiction = new Nonfiction();
        Category dewey = new Category();
        dewey.setCategory("History");
        nonfiction.setDeweyClassification(dewey);
        System.out.println("\nNonfiction:");
        System.out.println("Dewey Classification: " + nonfiction.getDeweyClassification().getCategory());
        System.out.println("Topic: " + nonfiction.topic());

        // Scenario 9: Novel Class
        
        Novel novel = new Novel();
        novel.setTheAuthors(new Author[]{defaultAuthor, specificAuthor});
        novel.setMySeries(new Series());
        System.out.println("\nNovel:");
        System.out.println("Authors: ");
        for (Author auth : novel.getTheAuthors()) {
            System.out.println(" - " + auth.getName());
        }
        System.out.println("Series Name: " + novel.getMySeries().getSeriesName());
        System.out.println("Theme: " + novel.theme());

        // Scenario 10: Paperback Class
        
        Paperback paperback = new Paperback();
        System.out.println("\nPaperback:");
        System.out.println("Cover Art: " + paperback.coverArt());

        // Scenario 11: Publisher Class
        
        Publisher publisher1 = new Publisher("Famous Publisher", "789 Maple Ave");
        publisher1.setClassicsCatalog(new Classic[]{classic});
        System.out.println("\nPublisher:");
        System.out.println("Name: " + publisher1.getName());
        System.out.println("Address: " + publisher1.getAddress());
        System.out.println("Classics Catalog: ");
        for (Classic c : publisher1.getClassicsCatalog()) {
            System.out.println(" - Original Publication Year: " + c.getOrigPubYear());
        }
        System.out.println("Letter Head: " + publisher1.printLetterHead());

        // Scenario 12: Series Class
        
        Series series = new Series();
        series.setSeriesName("Epic Adventures");
        System.out.println("\nSeries:");
        System.out.println("Series Name: " + series.getSeriesName());
        System.out.println("Theme: " + series.theme());

        // Scenario 13: Story Class
        
        Story story = new Story();
        story.setTheAuthors(new Author[]{defaultAuthor, specificAuthor});
        System.out.println("\nStory:");
        System.out.println("Authors: ");
        for (Author auth : story.getTheAuthors()) {
            System.out.println(" - " + auth.getName());
        }
        System.out.println("Plot: " + story.plot());
    }
}
