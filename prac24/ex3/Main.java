package prac24.ex3;

// Интерфейс для документов
interface IDocument {
    void open(); // Открытие документа
    void save(); // Сохранение документа
    String getContent(); // Получение содержимого документа
}

// Конкретный класс для текстового документа
class TextDocument implements IDocument {
    private String content;

    public TextDocument() {
        this.content = ""; // Инициализация пустым содержимым
    }

    @Override
    public void open() {
        this.content = "Это текстовый документ."; // Эмулируем открытие
        System.out.println("Документ открыт: " + content);
    }

    @Override
    public void save() {
        System.out.println("Документ сохранен: " + content);
    }

    @Override
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

// Интерфейс для создания документов
interface ICreateDocument {
    IDocument createNew(); // Создание нового документа
    IDocument createOpen(); // Открытие существующего документа
}

// Фабрика для создания текстового документа
class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument(); // Создает новый текстовый документ
    }

    @Override
    public IDocument createOpen() {
        TextDocument textDocument = new TextDocument();
        textDocument.open(); // Эмулируем открытие документа
        return textDocument;
    }
}

// Основной класс редактора
class Editor {
    private IDocument document;
    private ICreateDocument documentFactory;

    public Editor(ICreateDocument factory) {
        this.documentFactory = factory;
    }

    public void newDocument() {
        document = documentFactory.createNew();
        System.out.println("Создан новый документ.");
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        System.out.println("Открыт документ.");
    }

    public void saveDocument() {
        if (document != null) {
            document.save();
        } else {
            System.out.println("Нет документа для сохранения.");
        }
    }

    public void setDocumentContent(String content) {
        if (document instanceof TextDocument) {
            ((TextDocument) document).setContent(content);
        }
    }
}

// Демонстрация работы каркаса редактора
public class Main {
    public static void main(String[] args) {
        // Создаем фабрику для текстового документа
        ICreateDocument textFactory = new CreateTextDocument();

        // Создаем редактор с текстовой фабрикой
        Editor editor = new Editor(textFactory);

        // Использование редактора
        editor.newDocument(); // Создаем новый документ
        editor.setDocumentContent("Привет, мир!"); // Устанавливаем содержание
        editor.saveDocument(); // Сохраняем документ

        editor.openDocument(); // Открываем существующий документ
        editor.saveDocument(); // Сохраняем открытый документ
    }
}