require_relative '../src/word_count.rb'

RSpec.describe 'rspec test' do
  it '1 is 1' do
    expect(1).to eq 1
  end
end

RSpec.describe 'Word Count' do
  it 'input one hello' do
    expected = {'hello' => 1}
    expect(WordCount.new.calc('hello')).to eq expected
  end

  it 'input two hello' do
    expected = {'hello' => 2}
    expect(WordCount.new.calc('hello hello')).to eq expected
  end

  it 'input hello world' do
    expected = {'hello' => 1, 'world' => 1}
    expect(WordCount.new.calc('hello world')).to eq expected
  end
end
