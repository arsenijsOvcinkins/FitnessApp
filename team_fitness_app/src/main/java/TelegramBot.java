import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
public class TelegramBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();

            if (messageText.equals("/start"))
            {
                SendMessage message = new SendMessage();
                message.setChatId(String.valueOf(update.getMessage().getChatId()));
                message.setText("Nice to see you, " + update.getMessage().getFrom().getFirstName() );
                try {
                    execute(message);
                }catch (TelegramApiException e){
                    e.printStackTrace();
                }
            }
            if (messageText.equals("/hello")) {
                SendMessage message = new SendMessage();
                message.setChatId(String.valueOf(update.getMessage().getChatId()));
                message.setText("Hello, world!");
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @SuppressWarnings("SpellCheckingInspection")
    @Override
    public String getBotToken() {
        return "6280084040:AAEF-qTKlvrOXULy0Vu8c5DrtpZ9hkpyBIE";
    }

    @Override
    public String getBotUsername() {
        return "@java2_fitness_app_bot";
    }

    public static void main(String[] args) throws TelegramApiException {
        TelegramBot bot = new TelegramBot();
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        try {
            botsApi.registerBot(bot);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}