{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyNJxlAHO5vsLul5Lk4St0+o",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/gogi102/JunseogYang-Java-Python/blob/main/Untitled13.ipynb\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": 20,
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "uRT3Ox-Q7rgZ",
        "outputId": "76106c7d-bdde-442d-aaf7-202670c9f607"
      },
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "사칙연산을 할 숫자를 입력 :77\n",
            "+,-,*,/중 무엇을 할지 입력 :ㅏ\n",
            "나눌 수 입력:2\n",
            "다시 ㄱ\n"
          ]
        }
      ],
      "source": [
        "#사칙연산 계산기 만들기!\n",
        "\n",
        "a = int(input(\"사칙연산을 할 숫자를 입력 :\")) #a 라는 변수에 사칙연산을 할 수를 입력받는 코드이다.\n",
        "b = str(input(\"+,-,*,/중 무엇을 할지 입력 :\"))#b 라는 변수에 + - * / 중 하나를 입력 받는 코드이다.\n",
        "c = int(input(\"나눌 수 입력:\"))#c라는 변수에 a를 연산할 값은 받는 함수이다.\n",
        "if b == \"+\":#if 조건문으로 b에서 +를 입력받았을데 밑에있는 print(a,\"+\", c,\"=\",a+c)를 실행 시키는 문장이다.\n",
        "  print(a,\"+\", c,\"=\",a+c)#그냥 a+c를 출력하는 문장이다.\n",
        "elif b == \"-\":#if 조건문으로 b에서 -를 입력받았을데 밑에있는 print(a,\"-\", c,\"=\",a-c)를 실행 시키는 문장이다.\n",
        "   print(a,\"-\",c,\"=\",a-c)#그냥 a-c를 출력하는 문장이다.\n",
        "elif b == \"*\":#if 조건문으로 b에서 *를 입력받았을데 밑에있는 print(a,\"*\", c,\"=\",a*c)를 실행 시키는 문장이다.\n",
        "  print(a,\"*\",c,\"=\",a*c)#그냥 a*c를 출력하는 문장이다.\n",
        "elif b == \"/\" :#if 조건문으로 b에서 /를 입력받았을데 밑에있는 print(a,\"/\", c,\"=\",a/c)를 실행 시키는 문장이다.\n",
        "  print(a,\"/\",c,\"=\",a/c)#그냥 a/c를 출력하는 문장이다.\n",
        "else :\n",
        "  print(\"다시 ㄱ\")#b에서 +-*/가 아닌 다른것을 입력 받았을때 돌려보내는 코드 "
      ]
    }
  ]
}
