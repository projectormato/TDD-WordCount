require_relative '../src/word_count.rb'

RSpec.describe 'rspec test' do
  it '1 is 1' do
    expect(1).to eq 1
  end
end

RSpec.describe 'Word Count' do
  it 'input one hello' do
    expect(WordCount.new.calc('hello')).to eq({'hello' => 1})
  end

  it 'input two hello' do
    expect(WordCount.new.calc('hello hello')).to eq({'hello' => 2})
  end

  it 'input hello world' do
    expect(WordCount.new.calc('hello world')).to eq({'hello' => 1, 'world' => 1})
  end
end
