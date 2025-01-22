import boto3

# Configure o cliente do Amazon Q
q_client = boto3.client('q', region_name='us-east-1')  # Substitua 'us-east-1' pela região correta

def query_amazon_q(question):
    """
    Consulta o Amazon Q com a pergunta dada e retorna a resposta.

    Args:
        question: A pergunta a ser feita ao Amazon Q.

    Returns:
        A resposta do Amazon Q.
    """
    try:
        response = q_client.query(
            Question=question
        )
        return response.get('Response', 'No response found')
    except Exception as e:
        return str(e)

# Loop interativo
while True:
    user_input = input("Ask me a question (or type 'exit' to quit): ")
    if user_input.lower() == 'exit':
        break
    answer = query_amazon_q(user_input)
    print(f"Answer: {answer}")
