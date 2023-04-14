from datetime import date
from datetime import timedelta
import win32com.client

if __name__ == '__main__':
    outlook = win32com.client.Dispatch("Outlook.Application").GetNamespace("MAPI")
    print()
    today = date.today()
    print("Today is: ", today)

    # Yesterday date
    yesterday = today - timedelta(days=1)
    print("Yesterday was: ", yesterday)

    inbox = outlook.GetDefaultFolder(6)
    messages = inbox.Items
    message = messages.GetFirst()
    print("MAILS:")
    while True:
        try:
            if ((message.senton.date() == today) or (message.senton.date() == yesterday)) and (message.subject == "Teste") :
                print(message.subject)  # get the subject of the email
                print(message.SenderEmailAddress)
                attachments = message.Attachments
                ix = 0
                while True:
                    try:
                        ix += 1
                        attachment = attachments.Item(ix)
                        print(attachment)
                        atName = str(attachment).lower()
                        path = 'S:\\PM\\ter\\ets\\Inter_Setor\\COMPARTILHADO\\APRENDIZES\\DIGITAL_SOLUTIONS_05\\RAISSA_ROSSI\\.TEF\\'
                        attachment.SaveASFile(path + '\\' + message.subject + '\\' + atName)
                    except:
                        break
                print(message.senton.date())  # get the subject of the email
            message = messages.GetNext()

        except:
            message = messages.GetNext()
        finally:
            if message is None:
                break

            # exit()
